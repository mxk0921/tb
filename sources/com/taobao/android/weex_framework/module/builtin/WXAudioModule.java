package com.taobao.android.weex_framework.module.builtin;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.uc.webview.export.media.CommandID;
import tb.d7x;
import tb.f4x;
import tb.kce;
import tb.r3x;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXAudioModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"create", "play", "pause", "destroy", "setSrc", "setCurrentTime", "getCurrentTime", "getDuration", CommandID.setMuted, "isMuted", "isPaused", "isEnded", "setLoop", "setAutoPlay", "addEventListener", "removeEventListener"};
    public static final String NAME = "audio";
    private final kce weexAudioResolver = r3x.c();

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$10");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.addEventListener(WXAudioModule.access$1500(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$1600(WXAudioModule.this, this.d, 1).toStringValueOrNull());
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$11");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.removeEventListener(WXAudioModule.access$1700(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$1800(WXAudioModule.this, this.d, 1).toStringValueOrNull());
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXAudioModule.this.create(this.d[0].toIntValue(), this.d[1].toJSONObjectOrNull());
            }
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.play(WXAudioModule.access$000(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$100(WXAudioModule.this, this.d, 1), WXAudioModule.access$200(WXAudioModule.this, this.d, 2));
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.pause(WXAudioModule.access$300(wXAudioModule, this.d, 0).toIntValue());
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$4");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.destroy(WXAudioModule.access$400(wXAudioModule, this.d, 0).toIntValue());
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$5");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.setSrc(WXAudioModule.access$500(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$600(WXAudioModule.this, this.d, 1).toStringValueOrNull());
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$6");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.setCurrentTime(WXAudioModule.access$700(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$800(WXAudioModule.this, this.d, 1).toIntValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public i(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$7");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.setMuted(WXAudioModule.access$900(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$1000(WXAudioModule.this, this.d, 1).toBoolValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public j(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$8");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.setLoop(WXAudioModule.access$1100(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$1200(WXAudioModule.this, this.d, 1).toBoolValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue[] d;

        public k(WeexValue[] weexValueArr) {
            this.d = weexValueArr;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule$9");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            WXAudioModule wXAudioModule = WXAudioModule.this;
            wXAudioModule.setAutoPlay(WXAudioModule.access$1300(wXAudioModule, this.d, 0).toIntValue(), WXAudioModule.access$1400(WXAudioModule.this, this.d, 1).toBoolValue());
        }
    }

    public static /* synthetic */ WeexValue access$000(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("bb10ead0", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$100(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("3daed6f1", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1000(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("392e8ac1", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1100(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("a9136460", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1200(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("18f83dff", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1300(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("88dd179e", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1400(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("f8c1f13d", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1500(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("68a6cadc", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1600(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("d88ba47b", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1700(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("48707e1a", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$1800(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("b85557b9", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ f4x access$200(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4x) ipChange.ipc$dispatch("7637a4f2", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getCallback(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$300(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("abf77ad", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$400(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("7aa4514c", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$500(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ea892aeb", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$600(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("5a6e048a", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$700(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ca52de29", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$800(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("3a37b7c8", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ WeexValue access$900(WXAudioModule wXAudioModule, WeexValue[] weexValueArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("aa1c9167", new Object[]{wXAudioModule, weexValueArr, new Integer(i2)});
        }
        return wXAudioModule.getArg(weexValueArr, i2);
    }

    public static /* synthetic */ Object ipc$super(WXAudioModule wXAudioModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -887693520) {
            super.onInit((String) objArr[0], (d7x) objArr[1]);
            return null;
        } else if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_framework/module/builtin/WXAudioModule");
        }
    }

    public void addEventListener(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143c5d39", new Object[]{this, new Integer(i2), str});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.n(getWeexInstance(), i2, str);
        }
    }

    public void create(int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984a1b10", new Object[]{this, new Integer(i2), jSONObject});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.f(getWeexInstance(), i2, jSONObject);
        }
    }

    public void destroy(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i2)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.e(getWeexInstance(), i2);
        }
    }

    public int getCurrentTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb13c69f", new Object[]{this, new Integer(i2)})).intValue();
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            return kceVar.g(getWeexInstance(), i2);
        }
        return 0;
    }

    public long getDuration(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2ec4a86", new Object[]{this, new Integer(i2)})).longValue();
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            return kceVar.o(getWeexInstance(), i2);
        }
        return 0L;
    }

    public boolean isEnded(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7d755b0", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            return kceVar.a(getWeexInstance(), i2);
        }
        return false;
    }

    public boolean isMuted(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e614b59f", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            return kceVar.k(getWeexInstance(), i2);
        }
        return false;
    }

    public boolean isPaused(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("595a0f68", new Object[]{this, new Integer(i2)})).booleanValue();
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            return kceVar.i(getWeexInstance(), i2);
        }
        return false;
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
        } else {
            super.onInit(str, d7xVar);
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        this.weexAudioResolver.c(getWeexInstance().getInstanceId());
    }

    public void pause(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5aa326", new Object[]{this, new Integer(i2)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.q(getWeexInstance(), i2);
        }
    }

    public void play(int i2, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9e5104", new Object[]{this, new Integer(i2), f4xVar, f4xVar2});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.b(getWeexInstance(), i2, f4xVar, f4xVar2);
        }
    }

    public void removeEventListener(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc2e79c", new Object[]{this, new Integer(i2), str});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.m(getWeexInstance(), i2, str);
        }
    }

    public void setAutoPlay(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaed533d", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.j(getWeexInstance(), i2, z);
        }
    }

    public void setCurrentTime(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52fb8e4b", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.l(getWeexInstance(), i2, i3);
        }
    }

    public void setLoop(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53e609e", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.d(getWeexInstance(), i2, z);
        }
    }

    public void setMuted(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c9ce61", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.h(getWeexInstance(), i2, z);
        }
    }

    public void setSrc(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a03adc4", new Object[]{this, new Integer(i2), str});
            return;
        }
        kce kceVar = this.weexAudioResolver;
        if (kceVar != null) {
            kceVar.p(getWeexInstance(), i2, str);
        }
    }

    static {
        t2o.a(982516100);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
        if (r11.equals("addEventListener") == false) goto L_0x002c;
     */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.weex.WeexValue callModuleMethod(com.taobao.android.weex.WeexInstanceImpl r9, java.lang.String r10, java.lang.String r11, com.taobao.android.weex.WeexValue[] r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.WXAudioModule.callModuleMethod(com.taobao.android.weex.WeexInstanceImpl, java.lang.String, java.lang.String, com.taobao.android.weex.WeexValue[]):com.taobao.android.weex.WeexValue");
    }
}
