package com.taobao.live.home.widget.tab;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.a;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a.f DEFAULT_ANIMATOR_CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public com.taobao.live.home.widget.tab.a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.live.home.widget.tab.a) ipChange.ipc$dispatch("3adc3e66", new Object[]{this});
            }
            return new com.taobao.live.home.widget.tab.a(new com.taobao.live.home.widget.tab.b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355538);
            t2o.a(806355536);
        }
    }

    static {
        t2o.a(806355534);
    }

    public static com.taobao.live.home.widget.tab.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.live.home.widget.tab.a) ipChange.ipc$dispatch("3adc3e66", new Object[0]);
        }
        return ((a) DEFAULT_ANIMATOR_CREATOR).a();
    }
}
