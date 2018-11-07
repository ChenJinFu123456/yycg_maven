package yycg.business.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YycgdrkExample extends BusinessBasePo {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YycgdrkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNull() {
            addCriterion("YYCGDID is null");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNotNull() {
            addCriterion("YYCGDID is not null");
            return (Criteria) this;
        }

        public Criteria andYycgdidEqualTo(String value) {
            addCriterion("YYCGDID =", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotEqualTo(String value) {
            addCriterion("YYCGDID <>", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThan(String value) {
            addCriterion("YYCGDID >", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThanOrEqualTo(String value) {
            addCriterion("YYCGDID >=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThan(String value) {
            addCriterion("YYCGDID <", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThanOrEqualTo(String value) {
            addCriterion("YYCGDID <=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLike(String value) {
            addCriterion("YYCGDID like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotLike(String value) {
            addCriterion("YYCGDID not like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidIn(List<String> values) {
            addCriterion("YYCGDID in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotIn(List<String> values) {
            addCriterion("YYCGDID not in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidBetween(String value1, String value2) {
            addCriterion("YYCGDID between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotBetween(String value1, String value2) {
            addCriterion("YYCGDID not between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNull() {
            addCriterion("YPXXID is null");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNotNull() {
            addCriterion("YPXXID is not null");
            return (Criteria) this;
        }

        public Criteria andYpxxidEqualTo(String value) {
            addCriterion("YPXXID =", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotEqualTo(String value) {
            addCriterion("YPXXID <>", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThan(String value) {
            addCriterion("YPXXID >", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThanOrEqualTo(String value) {
            addCriterion("YPXXID >=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThan(String value) {
            addCriterion("YPXXID <", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThanOrEqualTo(String value) {
            addCriterion("YPXXID <=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLike(String value) {
            addCriterion("YPXXID like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotLike(String value) {
            addCriterion("YPXXID not like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIn(List<String> values) {
            addCriterion("YPXXID in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotIn(List<String> values) {
            addCriterion("YPXXID not in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidBetween(String value1, String value2) {
            addCriterion("YPXXID between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotBetween(String value1, String value2) {
            addCriterion("YPXXID not between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNull() {
            addCriterion("VCHAR5 is null");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNotNull() {
            addCriterion("VCHAR5 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar5EqualTo(String value) {
            addCriterion("VCHAR5 =", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotEqualTo(String value) {
            addCriterion("VCHAR5 <>", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThan(String value) {
            addCriterion("VCHAR5 >", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR5 >=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThan(String value) {
            addCriterion("VCHAR5 <", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThanOrEqualTo(String value) {
            addCriterion("VCHAR5 <=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Like(String value) {
            addCriterion("VCHAR5 like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotLike(String value) {
            addCriterion("VCHAR5 not like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5In(List<String> values) {
            addCriterion("VCHAR5 in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotIn(List<String> values) {
            addCriterion("VCHAR5 not in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Between(String value1, String value2) {
            addCriterion("VCHAR5 between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotBetween(String value1, String value2) {
            addCriterion("VCHAR5 not between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andRklIsNull() {
            addCriterion("RKL is null");
            return (Criteria) this;
        }

        public Criteria andRklIsNotNull() {
            addCriterion("RKL is not null");
            return (Criteria) this;
        }

        public Criteria andRklEqualTo(Integer value) {
            addCriterion("RKL =", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklNotEqualTo(Integer value) {
            addCriterion("RKL <>", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklGreaterThan(Integer value) {
            addCriterion("RKL >", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklGreaterThanOrEqualTo(Integer value) {
            addCriterion("RKL >=", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklLessThan(Integer value) {
            addCriterion("RKL <", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklLessThanOrEqualTo(Integer value) {
            addCriterion("RKL <=", value, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklIn(List<Integer> values) {
            addCriterion("RKL in", values, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklNotIn(List<Integer> values) {
            addCriterion("RKL not in", values, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklBetween(Integer value1, Integer value2) {
            addCriterion("RKL between", value1, value2, "rkl");
            return (Criteria) this;
        }

        public Criteria andRklNotBetween(Integer value1, Integer value2) {
            addCriterion("RKL not between", value1, value2, "rkl");
            return (Criteria) this;
        }

        public Criteria andRkjeIsNull() {
            addCriterion("RKJE is null");
            return (Criteria) this;
        }

        public Criteria andRkjeIsNotNull() {
            addCriterion("RKJE is not null");
            return (Criteria) this;
        }

        public Criteria andRkjeEqualTo(Float value) {
            addCriterion("RKJE =", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeNotEqualTo(Float value) {
            addCriterion("RKJE <>", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeGreaterThan(Float value) {
            addCriterion("RKJE >", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeGreaterThanOrEqualTo(Float value) {
            addCriterion("RKJE >=", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeLessThan(Float value) {
            addCriterion("RKJE <", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeLessThanOrEqualTo(Float value) {
            addCriterion("RKJE <=", value, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeIn(List<Float> values) {
            addCriterion("RKJE in", values, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeNotIn(List<Float> values) {
            addCriterion("RKJE not in", values, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeBetween(Float value1, Float value2) {
            addCriterion("RKJE between", value1, value2, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkjeNotBetween(Float value1, Float value2) {
            addCriterion("RKJE not between", value1, value2, "rkje");
            return (Criteria) this;
        }

        public Criteria andRkdhIsNull() {
            addCriterion("RKDH is null");
            return (Criteria) this;
        }

        public Criteria andRkdhIsNotNull() {
            addCriterion("RKDH is not null");
            return (Criteria) this;
        }

        public Criteria andRkdhEqualTo(String value) {
            addCriterion("RKDH =", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhNotEqualTo(String value) {
            addCriterion("RKDH <>", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhGreaterThan(String value) {
            addCriterion("RKDH >", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhGreaterThanOrEqualTo(String value) {
            addCriterion("RKDH >=", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhLessThan(String value) {
            addCriterion("RKDH <", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhLessThanOrEqualTo(String value) {
            addCriterion("RKDH <=", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhLike(String value) {
            addCriterion("RKDH like", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhNotLike(String value) {
            addCriterion("RKDH not like", value, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhIn(List<String> values) {
            addCriterion("RKDH in", values, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhNotIn(List<String> values) {
            addCriterion("RKDH not in", values, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhBetween(String value1, String value2) {
            addCriterion("RKDH between", value1, value2, "rkdh");
            return (Criteria) this;
        }

        public Criteria andRkdhNotBetween(String value1, String value2) {
            addCriterion("RKDH not between", value1, value2, "rkdh");
            return (Criteria) this;
        }

        public Criteria andYpphIsNull() {
            addCriterion("YPPH is null");
            return (Criteria) this;
        }

        public Criteria andYpphIsNotNull() {
            addCriterion("YPPH is not null");
            return (Criteria) this;
        }

        public Criteria andYpphEqualTo(String value) {
            addCriterion("YPPH =", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphNotEqualTo(String value) {
            addCriterion("YPPH <>", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphGreaterThan(String value) {
            addCriterion("YPPH >", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphGreaterThanOrEqualTo(String value) {
            addCriterion("YPPH >=", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphLessThan(String value) {
            addCriterion("YPPH <", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphLessThanOrEqualTo(String value) {
            addCriterion("YPPH <=", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphLike(String value) {
            addCriterion("YPPH like", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphNotLike(String value) {
            addCriterion("YPPH not like", value, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphIn(List<String> values) {
            addCriterion("YPPH in", values, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphNotIn(List<String> values) {
            addCriterion("YPPH not in", values, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphBetween(String value1, String value2) {
            addCriterion("YPPH between", value1, value2, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpphNotBetween(String value1, String value2) {
            addCriterion("YPPH not between", value1, value2, "ypph");
            return (Criteria) this;
        }

        public Criteria andYpyxqIsNull() {
            addCriterion("YPYXQ is null");
            return (Criteria) this;
        }

        public Criteria andYpyxqIsNotNull() {
            addCriterion("YPYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andYpyxqEqualTo(Float value) {
            addCriterion("YPYXQ =", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqNotEqualTo(Float value) {
            addCriterion("YPYXQ <>", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqGreaterThan(Float value) {
            addCriterion("YPYXQ >", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqGreaterThanOrEqualTo(Float value) {
            addCriterion("YPYXQ >=", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqLessThan(Float value) {
            addCriterion("YPYXQ <", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqLessThanOrEqualTo(Float value) {
            addCriterion("YPYXQ <=", value, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqIn(List<Float> values) {
            addCriterion("YPYXQ in", values, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqNotIn(List<Float> values) {
            addCriterion("YPYXQ not in", values, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqBetween(Float value1, Float value2) {
            addCriterion("YPYXQ between", value1, value2, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andYpyxqNotBetween(Float value1, Float value2) {
            addCriterion("YPYXQ not between", value1, value2, "ypyxq");
            return (Criteria) this;
        }

        public Criteria andRktimeIsNull() {
            addCriterion("RKTIME is null");
            return (Criteria) this;
        }

        public Criteria andRktimeIsNotNull() {
            addCriterion("RKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRktimeEqualTo(Date value) {
            addCriterion("RKTIME =", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeNotEqualTo(Date value) {
            addCriterion("RKTIME <>", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeGreaterThan(Date value) {
            addCriterion("RKTIME >", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RKTIME >=", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeLessThan(Date value) {
            addCriterion("RKTIME <", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeLessThanOrEqualTo(Date value) {
            addCriterion("RKTIME <=", value, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeIn(List<Date> values) {
            addCriterion("RKTIME in", values, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeNotIn(List<Date> values) {
            addCriterion("RKTIME not in", values, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeBetween(Date value1, Date value2) {
            addCriterion("RKTIME between", value1, value2, "rktime");
            return (Criteria) this;
        }

        public Criteria andRktimeNotBetween(Date value1, Date value2) {
            addCriterion("RKTIME not between", value1, value2, "rktime");
            return (Criteria) this;
        }

        public Criteria andCgztIsNull() {
            addCriterion("CGZT is null");
            return (Criteria) this;
        }

        public Criteria andCgztIsNotNull() {
            addCriterion("CGZT is not null");
            return (Criteria) this;
        }

        public Criteria andCgztEqualTo(String value) {
            addCriterion("CGZT =", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotEqualTo(String value) {
            addCriterion("CGZT <>", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztGreaterThan(String value) {
            addCriterion("CGZT >", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztGreaterThanOrEqualTo(String value) {
            addCriterion("CGZT >=", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLessThan(String value) {
            addCriterion("CGZT <", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLessThanOrEqualTo(String value) {
            addCriterion("CGZT <=", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztLike(String value) {
            addCriterion("CGZT like", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotLike(String value) {
            addCriterion("CGZT not like", value, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztIn(List<String> values) {
            addCriterion("CGZT in", values, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotIn(List<String> values) {
            addCriterion("CGZT not in", values, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztBetween(String value1, String value2) {
            addCriterion("CGZT between", value1, value2, "cgzt");
            return (Criteria) this;
        }

        public Criteria andCgztNotBetween(String value1, String value2) {
            addCriterion("CGZT not between", value1, value2, "cgzt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}