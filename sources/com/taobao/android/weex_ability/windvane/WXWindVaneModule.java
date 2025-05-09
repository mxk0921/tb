package com.taobao.android.weex_ability.windvane;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.d7x;
import tb.dwh;
import tb.dww;
import tb.esw;
import tb.f4x;
import tb.iww;
import tb.jww;
import tb.lqw;
import tb.q3x;
import tb.spw;
import tb.t2o;
import tb.tvh;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WXWindVaneModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS = {"call", "call2"};
    public static final String NAME = "windvane";
    private esw mEntryManager;
    private final dww mEventListener;
    private jww mIWVWebView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ f4x e;

        public a(String str, f4x f4xVar) {
            this.d = str;
            this.e = f4xVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/windvane/WXWindVaneModule$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXWindVaneModule.access$000(WXWindVaneModule.this, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ f4x f;
        public final /* synthetic */ f4x g;

        public b(String str, String str2, f4x f4xVar, f4x f4xVar2) {
            this.d = str;
            this.e = str2;
            this.f = f4xVar;
            this.g = f4xVar2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/windvane/WXWindVaneModule$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WXWindVaneModule.this.call2(this.d, this.e, this.f, this.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements q3x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.q3x
        public void onActivityPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            }
        }

        @Override // tb.q3x
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            } else if (WXWindVaneModule.access$100(WXWindVaneModule.this) != null) {
                WXWindVaneModule.access$100(WXWindVaneModule.this).c(i, i2, intent);
            }
        }

        @Override // tb.q3x
        public void onActivityResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            }
        }

        @Override // tb.q3x
        public void onActivityStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            }
        }

        @Override // tb.q3x
        public void onActivityStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(980418686);
    }

    public WXWindVaneModule() {
        dww dwwVar = new dww();
        this.mEventListener = dwwVar;
        lqw.d().b(dwwVar);
    }

    public static /* synthetic */ void access$000(WXWindVaneModule wXWindVaneModule, String str, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98170bd6", new Object[]{wXWindVaneModule, str, f4xVar});
        } else {
            wXWindVaneModule.call(str, f4xVar);
        }
    }

    public static /* synthetic */ esw access$100(WXWindVaneModule wXWindVaneModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esw) ipChange.ipc$dispatch("3abe6168", new Object[]{wXWindVaneModule});
        }
        return wXWindVaneModule.mEntryManager;
    }

    public static /* synthetic */ Object ipc$super(WXWindVaneModule wXWindVaneModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -887693520) {
            super.onInit((String) objArr[0], (d7x) objArr[1]);
            return null;
        } else if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_ability/windvane/WXWindVaneModule");
        }
    }

    @MUSMethod
    public void call2(String str, String str2, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f935618b", new Object[]{this, str, str2, f4xVar, f4xVar2});
            return;
        }
        tvh adapterMUSInstance = ((WeexInstanceImpl) getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance != null && adapterMUSInstance.getUIContext() != null && !TextUtils.isEmpty(str2)) {
            if (this.mEntryManager == null) {
                this.mIWVWebView = new jww(adapterMUSInstance);
                this.mEntryManager = new esw(adapterMUSInstance.getUIContext(), this.mIWVWebView);
            }
            dww dwwVar = this.mEventListener;
            if (dwwVar != null) {
                dwwVar.b(adapterMUSInstance);
            }
            spw spwVar = new spw();
            if (!isLegalJsonObject(str2)) {
                if (f4xVar2 != null) {
                    f4xVar2.b(new Object[0]);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                }
            } else if (TextUtils.isEmpty(str)) {
                if (f4xVar2 != null) {
                    f4xVar2.b(new Object[0]);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                }
            } else if (str.indexOf(".") == -1) {
                if (f4xVar2 != null) {
                    f4xVar2.b(new Object[0]);
                }
                if (f4xVar != null) {
                    f4xVar.release();
                }
            } else {
                spwVar.f28213a = this.mIWVWebView;
                spwVar.d = str.substring(0, str.indexOf("."));
                spwVar.e = str.substring(str.indexOf(".") + 1);
                spwVar.f = str2;
                WVJsBridge.g().f(this.mEntryManager, spwVar, new iww(f4xVar2, true, f4xVar), new iww(f4xVar, true, f4xVar2));
            }
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        str2.hashCode();
        if (str2.equals("call")) {
            argCount(weexValueArr, 2);
            executeInMain(new a(getArg(weexValueArr, 0).toStringValueOrNull(), getCallback(weexValueArr, 1)));
            return null;
        } else if (!str2.equals("call2")) {
            return null;
        } else {
            argCount(weexValueArr, 4);
            executeInMain(new b(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getCallback(weexValueArr, 2), getCallback(weexValueArr, 3)));
            return null;
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        super.onInit(str, d7xVar);
        d7xVar.a(new c());
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        dww dwwVar = this.mEventListener;
        if (dwwVar != null) {
            dwwVar.a();
            lqw.d().h(this.mEventListener);
        }
        jww jwwVar = this.mIWVWebView;
        if (jwwVar != null) {
            jwwVar.a();
        }
        esw eswVar = this.mEntryManager;
        if (eswVar != null) {
            eswVar.d();
        }
    }

    private void call(String str, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e21ac9d", new Object[]{this, str, f4xVar});
            return;
        }
        tvh adapterMUSInstance = ((WeexInstanceImpl) getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance != null && adapterMUSInstance.getUIContext() != null && !TextUtils.isEmpty(str)) {
            if (this.mEntryManager == null) {
                this.mIWVWebView = new jww(adapterMUSInstance);
                this.mEntryManager = new esw(adapterMUSInstance.getUIContext(), this.mIWVWebView);
            }
            dww dwwVar = this.mEventListener;
            if (dwwVar != null) {
                dwwVar.b(adapterMUSInstance);
            }
            spw spwVar = new spw();
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                spwVar.f28213a = this.mIWVWebView;
                spwVar.d = parseObject.getString("class");
                spwVar.e = parseObject.getString("method");
                spwVar.f = parseObject.getString("data");
            }
            WVJsBridge.g().f(this.mEntryManager, spwVar, new iww(f4xVar, false, null), new iww(f4xVar, false, null));
        }
    }

    private boolean isLegalJsonObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61c2016b", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.length() >= 1000) {
            return str.startsWith("{") && str.endsWith("}");
        }
        try {
            return JSON.parseObject(str) != null;
        } catch (Throwable th) {
            dwh.y("Invalid param", th);
            return false;
        }
    }
}
