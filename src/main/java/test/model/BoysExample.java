package test.model;

import java.util.ArrayList;
import java.util.List;

public class BoysExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public BoysExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andBoyIdIsNull() {
            addCriterion("boy_id is null");
            return (Criteria) this;
        }

        public Criteria andBoyIdIsNotNull() {
            addCriterion("boy_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoyIdEqualTo(Integer value) {
            addCriterion("boy_id =", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdNotEqualTo(Integer value) {
            addCriterion("boy_id <>", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdGreaterThan(Integer value) {
            addCriterion("boy_id >", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("boy_id >=", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdLessThan(Integer value) {
            addCriterion("boy_id <", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdLessThanOrEqualTo(Integer value) {
            addCriterion("boy_id <=", value, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdIn(List<Integer> values) {
            addCriterion("boy_id in", values, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdNotIn(List<Integer> values) {
            addCriterion("boy_id not in", values, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdBetween(Integer value1, Integer value2) {
            addCriterion("boy_id between", value1, value2, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("boy_id not between", value1, value2, "boyId");
            return (Criteria) this;
        }

        public Criteria andBoNameIsNull() {
            addCriterion("bo_name is null");
            return (Criteria) this;
        }

        public Criteria andBoNameIsNotNull() {
            addCriterion("bo_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoNameEqualTo(String value) {
            addCriterion("bo_name =", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameNotEqualTo(String value) {
            addCriterion("bo_name <>", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameGreaterThan(String value) {
            addCriterion("bo_name >", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameGreaterThanOrEqualTo(String value) {
            addCriterion("bo_name >=", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameLessThan(String value) {
            addCriterion("bo_name <", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameLessThanOrEqualTo(String value) {
            addCriterion("bo_name <=", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameLike(String value) {
            addCriterion("bo_name like", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameNotLike(String value) {
            addCriterion("bo_name not like", value, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameIn(List<String> values) {
            addCriterion("bo_name in", values, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameNotIn(List<String> values) {
            addCriterion("bo_name not in", values, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameBetween(String value1, String value2) {
            addCriterion("bo_name between", value1, value2, "boName");
            return (Criteria) this;
        }

        public Criteria andBoNameNotBetween(String value1, String value2) {
            addCriterion("bo_name not between", value1, value2, "boName");
            return (Criteria) this;
        }

        public Criteria andToyIdIsNull() {
            addCriterion("toy_id is null");
            return (Criteria) this;
        }

        public Criteria andToyIdIsNotNull() {
            addCriterion("toy_id is not null");
            return (Criteria) this;
        }

        public Criteria andToyIdEqualTo(Integer value) {
            addCriterion("toy_id =", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdNotEqualTo(Integer value) {
            addCriterion("toy_id <>", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdGreaterThan(Integer value) {
            addCriterion("toy_id >", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("toy_id >=", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdLessThan(Integer value) {
            addCriterion("toy_id <", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdLessThanOrEqualTo(Integer value) {
            addCriterion("toy_id <=", value, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdIn(List<Integer> values) {
            addCriterion("toy_id in", values, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdNotIn(List<Integer> values) {
            addCriterion("toy_id not in", values, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdBetween(Integer value1, Integer value2) {
            addCriterion("toy_id between", value1, value2, "toyId");
            return (Criteria) this;
        }

        public Criteria andToyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("toy_id not between", value1, value2, "toyId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table boys
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 26 19:33:30 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}