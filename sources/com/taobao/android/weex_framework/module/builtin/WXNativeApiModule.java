package com.taobao.android.weex_framework.module.builtin;

import android.app.Dialog;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import tb.bvw;
import tb.egl;
import tb.f4x;
import tb.pg1;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXNativeApiModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] METHODS = {"open", "close", "push", "pop", MspEventTypes.ACTION_STRING_POST_NOTIFICATION, "toast", "confirm", "prompt", "alert", "addRule", pg1.ATOM_EXT_getBoundingClientRect, HapticsEngineAbility.API_VIBRATE, "replace"};
    private Dialog mActiveDialog;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public a(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.n(wXNativeApiModule, Integer.valueOf(WXNativeApiModule.access$2000(wXNativeApiModule, this.d, 0).toIntValueSafe(0)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public b(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$11");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.l(wXNativeApiModule, WXNativeApiModule.access$2100(wXNativeApiModule, this.d, 0).toStringValue(), WXNativeApiModule.access$2200(WXNativeApiModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public c(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.f(wXNativeApiModule, WXNativeApiModule.access$000(wXNativeApiModule, this.d, 0).toJSONObjectOrNull(), WXNativeApiModule.access$100(WXNativeApiModule.this, this.d, 1), WXNativeApiModule.access$200(WXNativeApiModule.this, this.d, 2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public d(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.c(wXNativeApiModule, WXNativeApiModule.access$300(wXNativeApiModule, this.d, 0).toJSONObjectOrNull(), WXNativeApiModule.access$400(WXNativeApiModule.this, this.d, 1), WXNativeApiModule.access$500(WXNativeApiModule.this, this.d, 2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public e(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.k(wXNativeApiModule, WXNativeApiModule.access$600(wXNativeApiModule, this.d, 0).toStringValueOrNull(), WXNativeApiModule.access$700(WXNativeApiModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public f(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.h(wXNativeApiModule, WXNativeApiModule.access$800(wXNativeApiModule, this.d, 0).toStringValue(), WXNativeApiModule.access$900(WXNativeApiModule.this, this.d, 1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public g(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.i(wXNativeApiModule, WXNativeApiModule.access$1000(wXNativeApiModule, this.d, 0).toStringValueOrNull(), WXNativeApiModule.access$1100(WXNativeApiModule.this, this.d, 1).toJSONObjectOrNull());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public h(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.m(wXNativeApiModule, WXNativeApiModule.access$1200(wXNativeApiModule, this.d, 0).toJSONObjectOrNull());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends egl<Dialog> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$7$1");
            }

            /* renamed from: d */
            public void c(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eef77222", new Object[]{this, dialog});
                } else {
                    WXNativeApiModule.access$1502(WXNativeApiModule.this, dialog);
                }
            }
        }

        public i(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$7");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.d(wXNativeApiModule, WXNativeApiModule.access$1300(wXNativeApiModule, this.d, 0).toJSONObjectOrNull(), WXNativeApiModule.access$1400(WXNativeApiModule.this, this.d, 1), new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends egl<Dialog> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$8$1");
            }

            /* renamed from: d */
            public void c(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eef77222", new Object[]{this, dialog});
                } else {
                    WXNativeApiModule.access$1502(WXNativeApiModule.this, dialog);
                }
            }
        }

        public j(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.j(wXNativeApiModule, WXNativeApiModule.access$1600(wXNativeApiModule, this.d, 0).toJSONObjectOrNull(), WXNativeApiModule.access$1700(WXNativeApiModule.this, this.d, 1), new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends egl<Dialog> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$9$1");
            }

            /* renamed from: d */
            public void c(Dialog dialog) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eef77222", new Object[]{this, dialog});
                } else {
                    WXNativeApiModule.access$1502(WXNativeApiModule.this, dialog);
                }
            }
        }

        public k(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXNativeApiModule wXNativeApiModule = WXNativeApiModule.this;
            bvw.b(wXNativeApiModule, WXNativeApiModule.access$1800(wXNativeApiModule, this.d, 0).toJSONObjectOrNull(), WXNativeApiModule.access$1900(WXNativeApiModule.this, this.d, 1), new a());
        }
    }

    public static /* synthetic */ WeexValue access$000(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("1dab0c7d", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$100(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("7f1ad1a4", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1000(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("13254bee", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1100(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ebb63e0d", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1200(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("c447302c", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1300(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("9cd8224b", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$1400(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("1eb74116", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ Dialog access$1502(WXNativeApiModule wXNativeApiModule, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("95fa99f5", new Object[]{wXNativeApiModule, dialog});
        }
        wXNativeApiModule.mActiveDialog = dialog;
        return dialog;
    }

    public static /* synthetic */ WeexValue access$1600(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("268af8a8", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$1700(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("4136f199", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1800(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("d7acdce6", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$1900(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("5836bc9b", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$200(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("8a9ab725", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$2000(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("4cb29daf", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$2100(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("25438fce", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$2200(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("6c3440b3", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$300(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("a75de2da", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$400(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("a19a8227", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$500(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("ad1a67a8", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$600(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("3110b937", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$700(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("c41a32aa", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$800(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("e2329d75", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$900(WXNativeApiModule wXNativeApiModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("db19fdac", new Object[]{wXNativeApiModule, weexValueArr, new Integer(i2)});
        }
        return wXNativeApiModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ Object ipc$super(WXNativeApiModule wXNativeApiModule, String str, Object... objArr) {
        if (str.hashCode() == -498459201) {
            super.onMainThreadDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXNativeApiModule");
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        Dialog dialog = this.mActiveDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mActiveDialog.dismiss();
        }
    }

    static {
        t2o.a(982516127);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r11.equals("open") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r9, java.lang.String r10, java.lang.String r11, com.taobao.android.weex.WeexValue[] r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXNativeApiModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
