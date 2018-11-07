package yycg.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class RoleoperateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleoperateExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andOperateidIsNull() {
            addCriterion("OPERATEID is null");
            return (Criteria) this;
        }

        public Criteria andOperateidIsNotNull() {
            addCriterion("OPERATEID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateidEqualTo(String value) {
            addCriterion("OPERATEID =", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotEqualTo(String value) {
            addCriterion("OPERATEID <>", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThan(String value) {
            addCriterion("OPERATEID >", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEID >=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThan(String value) {
            addCriterion("OPERATEID <", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLessThanOrEqualTo(String value) {
            addCriterion("OPERATEID <=", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidLike(String value) {
            addCriterion("OPERATEID like", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotLike(String value) {
            addCriterion("OPERATEID not like", value, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidIn(List<String> values) {
            addCriterion("OPERATEID in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotIn(List<String> values) {
            addCriterion("OPERATEID not in", values, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidBetween(String value1, String value2) {
            addCriterion("OPERATEID between", value1, value2, "operateid");
            return (Criteria) this;
        }

        public Criteria andOperateidNotBetween(String value1, String value2) {
            addCriterion("OPERATEID not between", value1, value2, "operateid");
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