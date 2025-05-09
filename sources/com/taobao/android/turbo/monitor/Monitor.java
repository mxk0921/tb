package com.taobao.android.turbo.monitor;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.mcs;
import tb.t2o;
import tb.xti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Monitor {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/android/turbo/monitor/Monitor$Code;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INIT_SERVICE_ERROR", "NOTIFY_ERROR", "EXCEPTION", "REQUEST_ERROR", "TIME_OUT", "WRONG_SERVICE", "STATE_ERROR", "ARGUMENT_ERROR", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Code {
        INIT_SERVICE_ERROR("initServiceError"),
        NOTIFY_ERROR("notifyError"),
        EXCEPTION("exception"),
        REQUEST_ERROR("requestError"),
        TIME_OUT("timeOut"),
        WRONG_SERVICE("wrongService"),
        STATE_ERROR("stateError"),
        ARGUMENT_ERROR("argumentError");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String value;

        Code(String str) {
            this.value = str;
        }

        public static /* synthetic */ Object ipc$super(Code code, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/monitor/Monitor$Code");
        }

        public static Code valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("fe81dd7a", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Code.class, str);
            }
            return (Code) valueOf;
        }

        public final String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/android/turbo/monitor/Monitor$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FRAMEWORK", "DRAWER", "TAB", "DATA", "REDPOINT", "SCHEDULER", mcs.EVENT_LIFECYCLE, "RENDER", "TRACK", "PRELOAD", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Type {
        FRAMEWORK(xti.KEY_TAB_BAR_FRAMEWORK),
        DRAWER("drawer"),
        TAB("tab"),
        DATA("data"),
        REDPOINT("redpoint"),
        SCHEDULER("scheduler"),
        LIFECYCLE("lifecycle"),
        RENDER("render"),
        TRACK("track"),
        PRELOAD("preload");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String value;

        Type(String str) {
            this.value = str;
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/monitor/Monitor$Type");
        }

        public static Type valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("ff7625cd", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Type.class, str);
            }
            return (Type) valueOf;
        }

        public final String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601373);
        }

        public a() {
        }

        public final void a(Type type, Code code, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d213c1d", new Object[]{this, type, code, map});
                return;
            }
            ckf.g(type, "type");
            ckf.g(code, "code");
            String jSONString = JSON.toJSONString(map);
            AppMonitor.Alarm.commitFail("turboEngine", "turboException", jSONString, type.getValue() + '_' + code.getValue(), null);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601371);
    }
}
