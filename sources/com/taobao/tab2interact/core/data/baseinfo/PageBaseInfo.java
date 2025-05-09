package com.taobao.tab2interact.core.data.baseinfo;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PageBaseInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public State f11834a;
    public Map<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum State {
        CREATE("create"),
        START("start"),
        STOP("stop"),
        DESTROY("destroy");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String text;

        State(String str) {
            this.text = str;
        }

        public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/data/baseinfo/PageBaseInfo$State");
        }

        public static State valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("62fbe69d", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(State.class, str);
            }
            return (State) valueOf;
        }

        @Override // java.lang.Enum
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.text;
        }
    }

    static {
        t2o.a(689963110);
    }

    public final State a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("3538af06", new Object[]{this});
        }
        return this.f11834a;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60f386cb", new Object[]{this});
        }
        return this.b;
    }

    public final void c(State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759e1f1e", new Object[]{this, state});
        } else {
            this.f11834a = state;
        }
    }

    public final void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd570523", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }
}
