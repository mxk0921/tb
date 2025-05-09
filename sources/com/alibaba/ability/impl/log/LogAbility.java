package com.alibaba.ability.impl.log;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLogAbility;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.LogLevel;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.eji;
import tb.heh;
import tb.iih;
import tb.jdb;
import tb.jpu;
import tb.kdb;
import tb.lcn;
import tb.lfh;
import tb.m;
import tb.m09;
import tb.meh;
import tb.pl4;
import tb.s4s;
import tb.t2o;
import tb.xeh;
import tb.xhv;
import tb.ygh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LogAbility extends AbsLogAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final eji f1970a = new eji("LogExecutor", 1);
    public lfh b = new lfh(1048576, m.CONFIG_TRACK_1022_INTERVAL_TIME, 60000);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(116391939);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;
        public final /* synthetic */ RVLLevel e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ jdb i;

        public b(kdb kdbVar, Map map, String str, RVLLevel rVLLevel, Map map2, String str2, String str3, jdb jdbVar) {
            this.b = kdbVar;
            this.c = map;
            this.d = str;
            this.e = rVLLevel;
            this.f = map2;
            this.g = str2;
            this.h = str3;
            this.i = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object m = this.b.m(pl4.KEY_PAGE_ID);
            if (!(m instanceof String)) {
                m = null;
            }
            String str = (String) m;
            Map map = this.c;
            map.put("event", this.d);
            map.put(m09.TASK_TYPE_LEVEL, this.e);
            map.put("ext", this.f);
            map.put("id", this.g);
            String str2 = this.h;
            if (str2 != null) {
                str = str2;
            }
            map.put("parentId", str);
            String jSONString = JSON.toJSONString(this.c);
            if (this.e == RVLLevel.Debug) {
                lcn.g("Megability/Log", this.h, jSONString);
                return;
            }
            lfh access$getLogSizeManager$p = LogAbility.access$getLogSizeManager$p(LogAbility.this);
            if (access$getLogSizeManager$p == null) {
                iih.INSTANCE.b("LogAbility", "Log 能力已销毁，无法上报日志");
                xhv xhvVar = xhv.INSTANCE;
            } else if (!access$getLogSizeManager$p.a(jSONString.length())) {
                this.i.O(new ErrorResult("1001", "累计的日志已超过单个页面的写入客户端日志的上线", (Map) null, 4, (a07) null));
            } else {
                lcn.g("Megability/Log", this.h, jSONString);
            }
        }
    }

    static {
        t2o.a(116391938);
    }

    public LogAbility() {
        s4s.e().a("Megability/Log", LogLevel.I);
    }

    public static final /* synthetic */ lfh access$getLogSizeManager$p(LogAbility logAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfh) ipChange.ipc$dispatch("b504bb8b", new Object[]{logAbility});
        }
        return logAbility.b;
    }

    public static final /* synthetic */ void access$setLogSizeManager$p(LogAbility logAbility, lfh lfhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bc40bb", new Object[]{logAbility, lfhVar});
        } else {
            logAbility.b = lfhVar;
        }
    }

    public static /* synthetic */ Object ipc$super(LogAbility logAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/log/LogAbility");
    }

    public static /* synthetic */ void writeLog$default(LogAbility logAbility, kdb kdbVar, jdb jdbVar, RVLLevel rVLLevel, String str, Map map, String str2, String str3, Map map2, int i, Object obj) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f420b3", new Object[]{logAbility, kdbVar, jdbVar, rVLLevel, str, map, str2, str3, map2, new Integer(i), obj});
            return;
        }
        if ((i & 128) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = map2;
        }
        logAbility.a(kdbVar, jdbVar, rVLLevel, str, map, str2, str3, linkedHashMap);
    }

    public final void a(kdb kdbVar, jdb jdbVar, RVLLevel rVLLevel, String str, Map<String, ? extends Object> map, String str2, String str3, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1968b61e", new Object[]{this, kdbVar, jdbVar, rVLLevel, str, map, str2, str3, map2});
        } else {
            eji.j(this.f1970a, new b(kdbVar, map2, str, rVLLevel, map, str2, str3, jdbVar), 0L, null, 6, null);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLogAbility
    public void debug(kdb kdbVar, heh hehVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d23b705", new Object[]{this, kdbVar, hehVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(hehVar, "params");
        ckf.g(jdbVar, "callback");
        RVLLevel rVLLevel = RVLLevel.Debug;
        String str = hehVar.f20583a;
        ckf.f(str, "params.event");
        writeLog$default(this, kdbVar, jdbVar, rVLLevel, str, hehVar.b, hehVar.c, hehVar.d, null, 128, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLogAbility
    public void info(kdb kdbVar, xeh xehVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e194c09", new Object[]{this, kdbVar, xehVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(xehVar, "params");
        ckf.g(jdbVar, "callback");
        RVLLevel rVLLevel = RVLLevel.Info;
        String str = xehVar.f31336a;
        ckf.f(str, "params.event");
        writeLog$default(this, kdbVar, jdbVar, rVLLevel, str, xehVar.b, xehVar.c, xehVar.d, null, 128, null);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        lfh lfhVar = this.b;
        if (lfhVar != null) {
            lfhVar.c();
        }
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLogAbility
    public void warn(kdb kdbVar, ygh yghVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99aa0f09", new Object[]{this, kdbVar, yghVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(yghVar, "params");
        ckf.g(jdbVar, "callback");
        RVLLevel rVLLevel = RVLLevel.Warn;
        String str = yghVar.f32077a;
        ckf.f(str, "params.event");
        writeLog$default(this, kdbVar, jdbVar, rVLLevel, str, yghVar.b, yghVar.c, yghVar.d, null, 128, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLogAbility
    public void error(kdb kdbVar, meh mehVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ababaf", new Object[]{this, kdbVar, mehVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(mehVar, "params");
        ckf.g(jdbVar, "callback");
        Map<String, Object> k = kotlin.collections.a.k(jpu.a("errorCode", mehVar.b), jpu.a("errorMsg", mehVar.c));
        RVLLevel rVLLevel = RVLLevel.Error;
        String str = mehVar.f23989a;
        ckf.f(str, "params.event");
        a(kdbVar, jdbVar, rVLLevel, str, mehVar.d, mehVar.e, mehVar.f, k);
    }
}
