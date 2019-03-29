package www.kjfl.com.pingtai.bean;

import java.util.ArrayList;
import java.util.List;

public class UseresExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public UseresExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
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
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiIsNull() {
            addCriterion("ubiaoshi is null");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiIsNotNull() {
            addCriterion("ubiaoshi is not null");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiEqualTo(Integer value) {
            addCriterion("ubiaoshi =", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiNotEqualTo(Integer value) {
            addCriterion("ubiaoshi <>", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiGreaterThan(Integer value) {
            addCriterion("ubiaoshi >", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ubiaoshi >=", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiLessThan(Integer value) {
            addCriterion("ubiaoshi <", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiLessThanOrEqualTo(Integer value) {
            addCriterion("ubiaoshi <=", value, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiIn(List<Integer> values) {
            addCriterion("ubiaoshi in", values, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiNotIn(List<Integer> values) {
            addCriterion("ubiaoshi not in", values, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiBetween(Integer value1, Integer value2) {
            addCriterion("ubiaoshi between", value1, value2, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUbiaoshiNotBetween(Integer value1, Integer value2) {
            addCriterion("ubiaoshi not between", value1, value2, "ubiaoshi");
            return (Criteria) this;
        }

        public Criteria andUmimaIsNull() {
            addCriterion("umima is null");
            return (Criteria) this;
        }

        public Criteria andUmimaIsNotNull() {
            addCriterion("umima is not null");
            return (Criteria) this;
        }

        public Criteria andUmimaEqualTo(String value) {
            addCriterion("umima =", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaNotEqualTo(String value) {
            addCriterion("umima <>", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaGreaterThan(String value) {
            addCriterion("umima >", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaGreaterThanOrEqualTo(String value) {
            addCriterion("umima >=", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaLessThan(String value) {
            addCriterion("umima <", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaLessThanOrEqualTo(String value) {
            addCriterion("umima <=", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaLike(String value) {
            addCriterion("umima like", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaNotLike(String value) {
            addCriterion("umima not like", value, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaIn(List<String> values) {
            addCriterion("umima in", values, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaNotIn(List<String> values) {
            addCriterion("umima not in", values, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaBetween(String value1, String value2) {
            addCriterion("umima between", value1, value2, "umima");
            return (Criteria) this;
        }

        public Criteria andUmimaNotBetween(String value1, String value2) {
            addCriterion("umima not between", value1, value2, "umima");
            return (Criteria) this;
        }

        public Criteria andShenheIsNull() {
            addCriterion("shenhe is null");
            return (Criteria) this;
        }

        public Criteria andShenheIsNotNull() {
            addCriterion("shenhe is not null");
            return (Criteria) this;
        }

        public Criteria andShenheEqualTo(Integer value) {
            addCriterion("shenhe =", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotEqualTo(Integer value) {
            addCriterion("shenhe <>", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThan(Integer value) {
            addCriterion("shenhe >", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThanOrEqualTo(Integer value) {
            addCriterion("shenhe >=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThan(Integer value) {
            addCriterion("shenhe <", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThanOrEqualTo(Integer value) {
            addCriterion("shenhe <=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheIn(List<Integer> values) {
            addCriterion("shenhe in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotIn(List<Integer> values) {
            addCriterion("shenhe not in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheBetween(Integer value1, Integer value2) {
            addCriterion("shenhe between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotBetween(Integer value1, Integer value2) {
            addCriterion("shenhe not between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andYidIsNull() {
            addCriterion("yid is null");
            return (Criteria) this;
        }

        public Criteria andYidIsNotNull() {
            addCriterion("yid is not null");
            return (Criteria) this;
        }

        public Criteria andYidEqualTo(Integer value) {
            addCriterion("yid =", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotEqualTo(Integer value) {
            addCriterion("yid <>", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThan(Integer value) {
            addCriterion("yid >", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yid >=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThan(Integer value) {
            addCriterion("yid <", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThanOrEqualTo(Integer value) {
            addCriterion("yid <=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidIn(List<Integer> values) {
            addCriterion("yid in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotIn(List<Integer> values) {
            addCriterion("yid not in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidBetween(Integer value1, Integer value2) {
            addCriterion("yid between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotBetween(Integer value1, Integer value2) {
            addCriterion("yid not between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andJfIsNull() {
            addCriterion("jf is null");
            return (Criteria) this;
        }

        public Criteria andJfIsNotNull() {
            addCriterion("jf is not null");
            return (Criteria) this;
        }

        public Criteria andJfEqualTo(Integer value) {
            addCriterion("jf =", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotEqualTo(Integer value) {
            addCriterion("jf <>", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThan(Integer value) {
            addCriterion("jf >", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfGreaterThanOrEqualTo(Integer value) {
            addCriterion("jf >=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThan(Integer value) {
            addCriterion("jf <", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfLessThanOrEqualTo(Integer value) {
            addCriterion("jf <=", value, "jf");
            return (Criteria) this;
        }

        public Criteria andJfIn(List<Integer> values) {
            addCriterion("jf in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotIn(List<Integer> values) {
            addCriterion("jf not in", values, "jf");
            return (Criteria) this;
        }

        public Criteria andJfBetween(Integer value1, Integer value2) {
            addCriterion("jf between", value1, value2, "jf");
            return (Criteria) this;
        }

        public Criteria andJfNotBetween(Integer value1, Integer value2) {
            addCriterion("jf not between", value1, value2, "jf");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 31 14:29:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
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