package www.kjfl.com.pingtai.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TiWenExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public TiWenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
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
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTuidIsNull() {
            addCriterion("tuid is null");
            return (Criteria) this;
        }

        public Criteria andTuidIsNotNull() {
            addCriterion("tuid is not null");
            return (Criteria) this;
        }

        public Criteria andTuidEqualTo(String value) {
            addCriterion("tuid =", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotEqualTo(String value) {
            addCriterion("tuid <>", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThan(String value) {
            addCriterion("tuid >", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidGreaterThanOrEqualTo(String value) {
            addCriterion("tuid >=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThan(String value) {
            addCriterion("tuid <", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLessThanOrEqualTo(String value) {
            addCriterion("tuid <=", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidLike(String value) {
            addCriterion("tuid like", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotLike(String value) {
            addCriterion("tuid not like", value, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidIn(List<String> values) {
            addCriterion("tuid in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotIn(List<String> values) {
            addCriterion("tuid not in", values, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidBetween(String value1, String value2) {
            addCriterion("tuid between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andTuidNotBetween(String value1, String value2) {
            addCriterion("tuid not between", value1, value2, "tuid");
            return (Criteria) this;
        }

        public Criteria andTbiaotiIsNull() {
            addCriterion("tbiaoti is null");
            return (Criteria) this;
        }

        public Criteria andTbiaotiIsNotNull() {
            addCriterion("tbiaoti is not null");
            return (Criteria) this;
        }

        public Criteria andTbiaotiEqualTo(String value) {
            addCriterion("tbiaoti =", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiNotEqualTo(String value) {
            addCriterion("tbiaoti <>", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiGreaterThan(String value) {
            addCriterion("tbiaoti >", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("tbiaoti >=", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiLessThan(String value) {
            addCriterion("tbiaoti <", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiLessThanOrEqualTo(String value) {
            addCriterion("tbiaoti <=", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiLike(String value) {
            addCriterion("tbiaoti like", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiNotLike(String value) {
            addCriterion("tbiaoti not like", value, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiIn(List<String> values) {
            addCriterion("tbiaoti in", values, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiNotIn(List<String> values) {
            addCriterion("tbiaoti not in", values, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiBetween(String value1, String value2) {
            addCriterion("tbiaoti between", value1, value2, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTbiaotiNotBetween(String value1, String value2) {
            addCriterion("tbiaoti not between", value1, value2, "tbiaoti");
            return (Criteria) this;
        }

        public Criteria andTneirongIsNull() {
            addCriterion("tneirong is null");
            return (Criteria) this;
        }

        public Criteria andTneirongIsNotNull() {
            addCriterion("tneirong is not null");
            return (Criteria) this;
        }

        public Criteria andTneirongEqualTo(String value) {
            addCriterion("tneirong =", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongNotEqualTo(String value) {
            addCriterion("tneirong <>", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongGreaterThan(String value) {
            addCriterion("tneirong >", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongGreaterThanOrEqualTo(String value) {
            addCriterion("tneirong >=", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongLessThan(String value) {
            addCriterion("tneirong <", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongLessThanOrEqualTo(String value) {
            addCriterion("tneirong <=", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongLike(String value) {
            addCriterion("tneirong like", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongNotLike(String value) {
            addCriterion("tneirong not like", value, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongIn(List<String> values) {
            addCriterion("tneirong in", values, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongNotIn(List<String> values) {
            addCriterion("tneirong not in", values, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongBetween(String value1, String value2) {
            addCriterion("tneirong between", value1, value2, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTneirongNotBetween(String value1, String value2) {
            addCriterion("tneirong not between", value1, value2, "tneirong");
            return (Criteria) this;
        }

        public Criteria andTdengjiIsNull() {
            addCriterion("tdengji is null");
            return (Criteria) this;
        }

        public Criteria andTdengjiIsNotNull() {
            addCriterion("tdengji is not null");
            return (Criteria) this;
        }

        public Criteria andTdengjiEqualTo(Integer value) {
            addCriterion("tdengji =", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiNotEqualTo(Integer value) {
            addCriterion("tdengji <>", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiGreaterThan(Integer value) {
            addCriterion("tdengji >", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("tdengji >=", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiLessThan(Integer value) {
            addCriterion("tdengji <", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiLessThanOrEqualTo(Integer value) {
            addCriterion("tdengji <=", value, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiIn(List<Integer> values) {
            addCriterion("tdengji in", values, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiNotIn(List<Integer> values) {
            addCriterion("tdengji not in", values, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiBetween(Integer value1, Integer value2) {
            addCriterion("tdengji between", value1, value2, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTdengjiNotBetween(Integer value1, Integer value2) {
            addCriterion("tdengji not between", value1, value2, "tdengji");
            return (Criteria) this;
        }

        public Criteria andTjiejueIsNull() {
            addCriterion("tjiejue is null");
            return (Criteria) this;
        }

        public Criteria andTjiejueIsNotNull() {
            addCriterion("tjiejue is not null");
            return (Criteria) this;
        }

        public Criteria andTjiejueEqualTo(Integer value) {
            addCriterion("tjiejue =", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueNotEqualTo(Integer value) {
            addCriterion("tjiejue <>", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueGreaterThan(Integer value) {
            addCriterion("tjiejue >", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueGreaterThanOrEqualTo(Integer value) {
            addCriterion("tjiejue >=", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueLessThan(Integer value) {
            addCriterion("tjiejue <", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueLessThanOrEqualTo(Integer value) {
            addCriterion("tjiejue <=", value, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueIn(List<Integer> values) {
            addCriterion("tjiejue in", values, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueNotIn(List<Integer> values) {
            addCriterion("tjiejue not in", values, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueBetween(Integer value1, Integer value2) {
            addCriterion("tjiejue between", value1, value2, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTjiejueNotBetween(Integer value1, Integer value2) {
            addCriterion("tjiejue not between", value1, value2, "tjiejue");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNull() {
            addCriterion("ttime is null");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNotNull() {
            addCriterion("ttime is not null");
            return (Criteria) this;
        }

        public Criteria andTtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ttime =", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ttime <>", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ttime >", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ttime >=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThan(Date value) {
            addCriterionForJDBCDate("ttime <", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ttime <=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ttime in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ttime not in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ttime between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ttime not between", value1, value2, "ttime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tiwen
     *
     * @mbg.generated do_not_delete_during_merge Thu Jan 03 19:34:18 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
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