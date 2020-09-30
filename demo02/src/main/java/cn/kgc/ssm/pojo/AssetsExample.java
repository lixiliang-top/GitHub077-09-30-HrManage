package cn.kgc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetsidIsNull() {
            addCriterion("assetsid is null");
            return (Criteria) this;
        }

        public Criteria andAssetsidIsNotNull() {
            addCriterion("assetsid is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsidEqualTo(String value) {
            addCriterion("assetsid =", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidNotEqualTo(String value) {
            addCriterion("assetsid <>", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidGreaterThan(String value) {
            addCriterion("assetsid >", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidGreaterThanOrEqualTo(String value) {
            addCriterion("assetsid >=", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidLessThan(String value) {
            addCriterion("assetsid <", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidLessThanOrEqualTo(String value) {
            addCriterion("assetsid <=", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidLike(String value) {
            addCriterion("assetsid like", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidNotLike(String value) {
            addCriterion("assetsid not like", value, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidIn(List<String> values) {
            addCriterion("assetsid in", values, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidNotIn(List<String> values) {
            addCriterion("assetsid not in", values, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidBetween(String value1, String value2) {
            addCriterion("assetsid between", value1, value2, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsidNotBetween(String value1, String value2) {
            addCriterion("assetsid not between", value1, value2, "assetsid");
            return (Criteria) this;
        }

        public Criteria andAssetsnameIsNull() {
            addCriterion("assetsname is null");
            return (Criteria) this;
        }

        public Criteria andAssetsnameIsNotNull() {
            addCriterion("assetsname is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsnameEqualTo(String value) {
            addCriterion("assetsname =", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameNotEqualTo(String value) {
            addCriterion("assetsname <>", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameGreaterThan(String value) {
            addCriterion("assetsname >", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetsname >=", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameLessThan(String value) {
            addCriterion("assetsname <", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameLessThanOrEqualTo(String value) {
            addCriterion("assetsname <=", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameLike(String value) {
            addCriterion("assetsname like", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameNotLike(String value) {
            addCriterion("assetsname not like", value, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameIn(List<String> values) {
            addCriterion("assetsname in", values, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameNotIn(List<String> values) {
            addCriterion("assetsname not in", values, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameBetween(String value1, String value2) {
            addCriterion("assetsname between", value1, value2, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetsnameNotBetween(String value1, String value2) {
            addCriterion("assetsname not between", value1, value2, "assetsname");
            return (Criteria) this;
        }

        public Criteria andAssetstypeIsNull() {
            addCriterion("assetstype is null");
            return (Criteria) this;
        }

        public Criteria andAssetstypeIsNotNull() {
            addCriterion("assetstype is not null");
            return (Criteria) this;
        }

        public Criteria andAssetstypeEqualTo(String value) {
            addCriterion("assetstype =", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeNotEqualTo(String value) {
            addCriterion("assetstype <>", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeGreaterThan(String value) {
            addCriterion("assetstype >", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeGreaterThanOrEqualTo(String value) {
            addCriterion("assetstype >=", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeLessThan(String value) {
            addCriterion("assetstype <", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeLessThanOrEqualTo(String value) {
            addCriterion("assetstype <=", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeLike(String value) {
            addCriterion("assetstype like", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeNotLike(String value) {
            addCriterion("assetstype not like", value, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeIn(List<String> values) {
            addCriterion("assetstype in", values, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeNotIn(List<String> values) {
            addCriterion("assetstype not in", values, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeBetween(String value1, String value2) {
            addCriterion("assetstype between", value1, value2, "assetstype");
            return (Criteria) this;
        }

        public Criteria andAssetstypeNotBetween(String value1, String value2) {
            addCriterion("assetstype not between", value1, value2, "assetstype");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNull() {
            addCriterion("intodate is null");
            return (Criteria) this;
        }

        public Criteria andIntodateIsNotNull() {
            addCriterion("intodate is not null");
            return (Criteria) this;
        }

        public Criteria andIntodateEqualTo(Date value) {
            addCriterion("intodate =", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotEqualTo(Date value) {
            addCriterion("intodate <>", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThan(Date value) {
            addCriterion("intodate >", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateGreaterThanOrEqualTo(Date value) {
            addCriterion("intodate >=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThan(Date value) {
            addCriterion("intodate <", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateLessThanOrEqualTo(Date value) {
            addCriterion("intodate <=", value, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateIn(List<Date> values) {
            addCriterion("intodate in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotIn(List<Date> values) {
            addCriterion("intodate not in", values, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateBetween(Date value1, Date value2) {
            addCriterion("intodate between", value1, value2, "intodate");
            return (Criteria) this;
        }

        public Criteria andIntodateNotBetween(Date value1, Date value2) {
            addCriterion("intodate not between", value1, value2, "intodate");
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