package com.xworkz.kuwyApp.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.kuwyApp.entity.LoanEligibilityEntity;
import com.xworkz.kuwyApp.entity.VehicleDetailsEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
public class VehicleDetailsDAOImpl implements VehicleDeatilsDAO {
	Logger logger = LoggerFactory.getLogger(VehicleDetailsDAOImpl.class);

	@Autowired
	private SessionFactory factory;

	@Override
	public Serializable saveVehicleData(LoanEligibilityEntity entity) {
		try (Session session = factory.openSession();) {
			Transaction transaction = session.beginTransaction();
			Serializable res = session.save(entity);
			transaction.commit();
			logger.info("Data is saved " + res);
			return res;
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Integer> getMfgYear() {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("SELECT distinct(mfgYear) FROM VehicleDetailsEntity");
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<String> getBrandByMfgYear(Integer mfgYear) {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("SELECT distinct(brand) FROM VehicleDetailsEntity where mfgYear=:year");
			query.setParameter("year", mfgYear);
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<String> getModelbyBrandNMfgYear(Integer mfgYear, String brand) {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery(
					"SELECT distinct(model) FROM VehicleDetailsEntity where mfgYear=:year and brand=:brand");
			query.setParameter("year", mfgYear);
			query.setParameter("brand", brand);
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<String> getVariantByBrandNYearNModel(Integer mfgYear, String brand, String model) {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery(
					"SELECT distinct(variant) FROM VehicleDetailsEntity where mfgYear=:year and brand=:brand and model=:model");
			query.setParameter("year", mfgYear);
			query.setParameter("brand", brand);
			query.setParameter("model", model);
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
		return null;
	}

	public VehicleDetailsEntity getVehicleByMFGModelBrandNVariant(String brand, int mfgYear, String model,
			String variant) {
		try (Session session = factory.openSession()) {
			Query query = session.createQuery(
					"FROM VehicleDetailsEntity WHERE mfgYear = :mfg AND model =:model AND brand =:brand AND variant = :variant");
			query.setParameter("mfg", mfgYear);
			query.setParameter("model", model);
			query.setParameter("brand", brand);
			query.setParameter("variant", variant);
			return (VehicleDetailsEntity) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();

		}
		return null;
	}

}
