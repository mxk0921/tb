package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.ConditionOpChecker;
import com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizVerConditionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.PageList;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class w12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = w12.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final String f30390a;
    public final Context b;
    public final BizTaskData c;
    public final Map<String, Long> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        long a(BizActionData bizActionData);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final boolean CLEAR_FAILED = false;
        public static final boolean CLEAR_SUCCESS = true;
        public static final int DEFAULT_CLEAR_SIZE = -1;
        public static final String MSG_BIZ_ACTION_FAILED = "CLEAR_ACTION_FAILED_WITH_TASK_";
        public static final String MSG_CONDITION_MATCH_FAILED = "MATCH_CONDITION_FAILED";
        public static final String MSG_DEFAULT = "";
        public static final String MSG_VERSION_CONDITION_MATCH_FAILED = "MATCH_VERSION_CONDITION_FAILED";

        /* renamed from: a  reason: collision with root package name */
        public boolean f30391a;
        public long b;
        public String c;

        static {
            t2o.a(737148991);
        }

        public b() {
            this("");
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1fd665a", new Object[]{bVar})).booleanValue();
            }
            return bVar.f30391a;
        }

        public static /* synthetic */ boolean b(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb12eb80", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.f30391a = z;
            return z;
        }

        public static /* synthetic */ String c(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39416d5d", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ long d(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b116c1e", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.b = j;
            return j;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
            }
            return this.c;
        }

        public long f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
            }
            return this.b;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
            }
            return this.f30391a;
        }

        public b(String str) {
            this(true, -1L, str);
        }

        public b(boolean z, long j, String str) {
            this.f30391a = z;
            this.b = j;
            this.c = str;
        }
    }

    static {
        t2o.a(737148989);
    }

    public w12(Context context, BizTaskData bizTaskData) {
        this.b = context;
        this.c = bizTaskData;
        this.f30390a = bizTaskData.taskId;
        this.d = bizTaskData.pathMap;
    }

    public final boolean a(List<PageList> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3147baa5", new Object[]{this, list, str, str2})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (PageList pageList : list) {
                if (pageList != null && pageList.isMarch(str, str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean b(BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30192b9b", new Object[]{this, bizVerConditionData})).booleanValue();
        }
        if (bizVerConditionData == null || TextUtils.isEmpty(bizVerConditionData.checkKey)) {
            return false;
        }
        return this.b.getSharedPreferences("biz_clear_executed_sp", 0).getBoolean(bizVerConditionData.checkKey, false);
    }

    public final boolean c(BizVerConditionData bizVerConditionData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c3052a", new Object[]{this, bizVerConditionData})).booleanValue();
        }
        try {
        } catch (Exception e2) {
            String str2 = e;
            TLog.loge(yr2.MODULE, str2, "checkPageList error :" + e2.getMessage());
        }
        if (c21.i() == null) {
            TLog.loge(yr2.MODULE, e, "apm getTopActivity is null");
            return true;
        }
        String name = c21.i().getClass().getName();
        if (c21.i().getIntent() != null) {
            str = c21.i().getIntent().getDataString();
        } else {
            str = null;
        }
        if (!e(bizVerConditionData.enablePageList, name, str) || !a(bizVerConditionData.disablePageList, name, str)) {
            return false;
        }
        TLog.logd(yr2.MODULE, e, "checkPageList result = true");
        return true;
    }

    public final boolean d(Context context, BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c76c6f", new Object[]{this, context, bizVerConditionData})).booleanValue();
        }
        if (bizVerConditionData == null) {
            return false;
        }
        if ((!bizVerConditionData.abEnable || ConfigCenter.isBizClearEnable(context, bizVerConditionData.abKey)) && !b(bizVerConditionData) && bf4.a(bizVerConditionData.appVersion, hg4.j().g()) && bf4.a(bizVerConditionData.osVersion, Build.VERSION.RELEASE) && c(bizVerConditionData)) {
            return true;
        }
        return false;
    }

    public final boolean e(List<PageList> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae584bcf", new Object[]{this, list, str, str2})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (PageList pageList : list) {
            if (pageList != null && pageList.isMarch(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public abstract long f(BizActionData bizActionData, Map<String, Long> map);

    public b g(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("19ded98c", new Object[]{this, map});
        }
        if (!d(this.b, this.c.condition)) {
            return new b(false, -1L, b.MSG_VERSION_CONDITION_MATCH_FAILED);
        }
        if (!ConditionOpChecker.b(this.c.sizeCondition, map)) {
            return new b(false, -1L, b.MSG_CONDITION_MATCH_FAILED);
        }
        b bVar = new b();
        long j = 0;
        for (BizActionData bizActionData : this.c.actionList) {
            long f = f(bizActionData, map);
            if (f < 0) {
                b.b(bVar, false);
                b.c(bVar, b.MSG_BIZ_ACTION_FAILED + this.f30390a);
            } else {
                j += f;
            }
        }
        b.d(bVar, j);
        if (b.a(bVar)) {
            j(this.c.condition);
        }
        return bVar;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f30390a;
    }

    public Map<String, Long> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("237d07b4", new Object[]{this});
        }
        return this.d;
    }

    public final void j(BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f53b6b6", new Object[]{this, bizVerConditionData});
        } else if (bizVerConditionData != null && !TextUtils.isEmpty(bizVerConditionData.checkKey)) {
            SharedPreferences.Editor edit = this.b.getSharedPreferences("biz_clear_executed_sp", 0).edit();
            edit.putBoolean(bizVerConditionData.checkKey, true);
            edit.commit();
        }
    }
}
