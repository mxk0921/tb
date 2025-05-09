package com.taobao.orange.candidate;

import android.os.RemoteException;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.aidl.OrangeCandidateCompareStub;
import com.taobao.orange.aidl.ParcelableCandidateCompare;
import com.taobao.orange.util.OLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ibl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UnitAnalyze {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Pattern BASE_FORMAT;
    private static final String CANDIDATE_HASH_BUCKET = "did_hash";
    private static final String TAG = "UnitAnalyze";
    public String key;
    private OPERATOR opr;
    private String val;
    private static final Map<String, OPERATOR> OPERATOR_SYMBOL_MAP = new HashMap();
    private static final Map<String, UnitAnalyze> CACHE_UNIT_ANALYZE_MAP = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.orange.candidate.UnitAnalyze$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR;

        static {
            int[] iArr = new int[OPERATOR.values().length];
            $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR = iArr;
            try {
                iArr[OPERATOR.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.NOT_EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.GREATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.GREATER_EQUALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.LESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.LESS_EQUALS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.FUZZY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[OPERATOR.NOT_FUZZY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum OPERATOR {
        EQUALS("="),
        GREATER_EQUALS(">="),
        LESS_EQUALS("<="),
        GREATER(">"),
        LESS("<"),
        NOT_EQUALS("!="),
        FUZZY("~="),
        NOT_FUZZY("!~");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String symbol;

        OPERATOR(String str) {
            this.symbol = str;
        }

        public static /* synthetic */ Object ipc$super(OPERATOR operator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/candidate/UnitAnalyze$OPERATOR");
        }

        public static OPERATOR valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OPERATOR) ipChange.ipc$dispatch("8e89c232", new Object[]{str});
            }
            return (OPERATOR) Enum.valueOf(OPERATOR.class, str);
        }

        public String getSymbol() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a171b2b", new Object[]{this});
            }
            return this.symbol;
        }
    }

    static {
        OPERATOR[] values;
        t2o.a(613417063);
        ArrayList arrayList = new ArrayList();
        for (OPERATOR operator : OPERATOR.values()) {
            OPERATOR_SYMBOL_MAP.put(operator.getSymbol(), operator);
            arrayList.add(operator.getSymbol());
        }
        BASE_FORMAT = Pattern.compile("^\\s*(\\w+)\\s*(" + ibl.f(arrayList) + ")\\s*(.+)\\s*$");
    }

    private UnitAnalyze(String str) {
        Matcher matcher = BASE_FORMAT.matcher(str);
        if (matcher.find()) {
            this.key = matcher.group(1);
            this.opr = OPERATOR_SYMBOL_MAP.get(matcher.group(2));
            this.val = matcher.group(3);
            if (this.key.equals("did_hash") && this.opr != OPERATOR.EQUALS) {
                throw new IllegalArgumentException("invalid hash candidate:" + str);
            }
            return;
        }
        throw new IllegalArgumentException("fail parse candidate:" + str);
    }

    public boolean match(String str, ParcelableCandidateCompare parcelableCandidateCompare) throws RemoteException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5637f999", new Object[]{this, str, parcelableCandidateCompare})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "match no clientVal", "key", this.key);
            }
            return false;
        } else if (parcelableCandidateCompare == null) {
            if (OLog.isPrintLog(1)) {
                OLog.d(TAG, "match no compare", "key", this.key);
            }
            return false;
        } else {
            if (OLog.isPrintLog(0)) {
                OLog.v(TAG, "match start", "key", this.key, "clientVal", str, "opr", this.opr.getSymbol(), "serverVal", this.val, "compare", parcelableCandidateCompare instanceof OrangeCandidateCompareStub ? ((OrangeCandidateCompareStub) parcelableCandidateCompare).getName() : null);
            }
            switch (AnonymousClass1.$SwitchMap$com$taobao$orange$candidate$UnitAnalyze$OPERATOR[this.opr.ordinal()]) {
                case 1:
                    z = parcelableCandidateCompare.equals(str, this.val);
                    break;
                case 2:
                    z = parcelableCandidateCompare.equalsNot(str, this.val);
                    break;
                case 3:
                    z = parcelableCandidateCompare.greater(str, this.val);
                    break;
                case 4:
                    z = parcelableCandidateCompare.greaterEquals(str, this.val);
                    break;
                case 5:
                    z = parcelableCandidateCompare.less(str, this.val);
                    break;
                case 6:
                    z = parcelableCandidateCompare.lessEquals(str, this.val);
                    break;
                case 7:
                    z = parcelableCandidateCompare.fuzzy(str, this.val);
                    break;
                case 8:
                    z = parcelableCandidateCompare.fuzzyNot(str, this.val);
                    break;
                default:
                    z = false;
                    break;
            }
            if (!z && OLog.isPrintLog(1)) {
                OLog.d(TAG, "match fail", "key", this.key);
            }
            return z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.key + this.opr.getSymbol() + this.val;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.orange.candidate.UnitAnalyze complie(java.lang.String r8) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.orange.candidate.UnitAnalyze.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "710d01cd"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r3, r1)
            com.taobao.orange.candidate.UnitAnalyze r8 = (com.taobao.orange.candidate.UnitAnalyze) r8
            return r8
        L_0x0015:
            long r2 = java.lang.System.nanoTime()
            boolean r4 = com.taobao.orange.a.z
            if (r4 == 0) goto L_0x0033
            java.util.Map<java.lang.String, com.taobao.orange.candidate.UnitAnalyze> r4 = com.taobao.orange.candidate.UnitAnalyze.CACHE_UNIT_ANALYZE_MAP
            java.lang.Object r5 = r4.get(r8)
            com.taobao.orange.candidate.UnitAnalyze r5 = (com.taobao.orange.candidate.UnitAnalyze) r5
            if (r5 != 0) goto L_0x0031
            com.taobao.orange.candidate.UnitAnalyze r5 = new com.taobao.orange.candidate.UnitAnalyze
            r5.<init>(r8)
            r4.put(r8, r5)
        L_0x002f:
            r4 = 0
            goto L_0x0039
        L_0x0031:
            r4 = 1
            goto L_0x0039
        L_0x0033:
            com.taobao.orange.candidate.UnitAnalyze r5 = new com.taobao.orange.candidate.UnitAnalyze
            r5.<init>(r8)
            goto L_0x002f
        L_0x0039:
            boolean r6 = com.taobao.orange.util.OLog.isPrintLog(r1)
            if (r6 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = "cache-hit"
            goto L_0x0047
        L_0x0044:
            java.lang.String r4 = "new-instance"
        L_0x0047:
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "candidate"
            r3[r0] = r6
            r3[r1] = r8
            java.lang.String r8 = "type"
            r0 = 2
            r3[r0] = r8
            r8 = 3
            r3[r8] = r4
            java.lang.String r8 = "cost"
            r0 = 4
            r3[r0] = r8
            r8 = 5
            r3[r8] = r2
            java.lang.String r8 = "UnitAnalyze"
            java.lang.String r0 = "[compile]"
            com.taobao.orange.util.OLog.d(r8, r0, r3)
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.candidate.UnitAnalyze.complie(java.lang.String):com.taobao.orange.candidate.UnitAnalyze");
    }
}
