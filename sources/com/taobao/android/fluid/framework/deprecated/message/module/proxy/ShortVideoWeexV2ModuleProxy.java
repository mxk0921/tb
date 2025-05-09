package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import java.io.Serializable;
import java.util.HashMap;
import tb.h4x;
import tb.hmi;
import tb.ir9;
import tb.nwv;
import tb.pr9;
import tb.pvh;
import tb.t2o;
import tb.uaw;
import tb.vrp;
import tb.x4w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ShortVideoWeexV2ModuleProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoWeexV2ModuleProxy";
    private final MUSModule mMUSModule;

    static {
        t2o.a(468714352);
    }

    public ShortVideoWeexV2ModuleProxy(MUSModule mUSModule) {
        this.mMUSModule = mUSModule;
        ir9.b(TAG, "新架构初始化 ShortVideoWeexV2ModuleProxy");
    }

    private static boolean checkNotifyValid(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91b520f", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.isDestroyed() || aVar.isInvalid()) {
            return false;
        }
        if (aVar.getUIContext() instanceof Activity) {
            return !((Activity) aVar.getContext().a()).isFinishing();
        }
        return true;
    }

    private boolean isFluidArchitecture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daeb73e", new Object[]{this})).booleanValue();
        }
        return this.mMUSModule.getInstance().getRenderRoot().getTag() instanceof hmi;
    }

    private static void putIntentExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939caf", new Object[]{intent, str, obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof CharSequence) {
                intent.putExtra(str, (CharSequence) obj);
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Byte) obj).byteValue());
            } else {
                intent.putExtra(str, obj.toString());
            }
        }
    }

    public void offNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4b20b1", new Object[]{this, jSONObject});
        } else if (isFluidArchitecture()) {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                com.taobao.android.fluid.framework.deprecated.message.module.notify.a.a().c(this.mMUSModule.getInstance(), string);
            }
            ir9.b(TAG, "新架构 Weex 2 页面解注册通知 offNotify : " + string);
        }
    }

    public void sendMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6326634a", new Object[]{this, jSONObject});
        } else {
            sendMessageAsync(jSONObject, null);
        }
    }

    public void sendMessageAsync(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcb7d75", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        View renderRoot = this.mMUSModule.getInstance().getRenderRoot();
        if (renderRoot != null && (renderRoot.getTag() instanceof IPreloadWeexService)) {
            ((IPreloadWeexService) renderRoot.getTag()).handleMessage(jSONObject, pvhVar);
        } else if (isFluidArchitecture()) {
            vrp vrpVar = new vrp(jSONObject, pvhVar != null ? new h4x(pvhVar) : null);
            ((hmi) this.mMUSModule.getInstance().getRenderRoot().getTag()).f(vrpVar);
            ir9.b(TAG, "新架构 Weex 2 页面发送消息 sendMessageAsync: " + vrpVar);
        }
    }

    public void snapShotVideo(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a22a9b", new Object[]{this, jSONObject, pvhVar});
        } else if (isFluidArchitecture()) {
            View renderView = this.mMUSModule.getInstance().getRenderView();
            x4w x4wVar = x4w.INSTANCE;
            x4wVar.e((ViewGroup) x4wVar.b(renderView.getParent()), new a(this, pvhVar));
            ir9.b(TAG, "新架构 Weex 2 页面截图 snapShotVideo");
        }
    }

    public void onNotify(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e398aea", new Object[]{this, jSONObject, pvhVar});
        } else if (isFluidArchitecture()) {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                a.C0420a aVar = new a.C0420a(pvhVar);
                if (nwv.t(Integer.valueOf(jSONObject.getIntValue("cnt")), 0) > 0) {
                    aVar.b(jSONObject.getIntValue("cnt"));
                }
                com.taobao.android.fluid.framework.deprecated.message.module.notify.a.a().b(this.mMUSModule.getInstance(), string, aVar);
            }
            ir9.b(TAG, "新架构 Weex 2 页面注册通知 onNotify : " + string);
        }
    }

    public void postNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d380e0", new Object[]{this, jSONObject});
        } else if (isFluidArchitecture()) {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                Intent intent = new Intent(string);
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (!nwv.o(jSONObject.get("appear"), false) || checkNotifyValid(this.mMUSModule.getInstance())) {
                    if (!(jSONObject2 == null || jSONObject2.keySet() == null)) {
                        for (String str : jSONObject2.keySet()) {
                            putIntentExtra(intent, str, jSONObject2.get(str));
                        }
                    }
                    LocalBroadcastManager.getInstance(this.mMUSModule.getInstance().getUIContext()).sendBroadcast(intent);
                } else {
                    return;
                }
            }
            ir9.b(TAG, "新架构 Weex 2 页面发送通知 postNotify : " + string);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements x4w.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f7811a;

        public a(ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy, pvh pvhVar) {
            this.f7811a = pvhVar;
        }

        public void a(Bitmap bitmap, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54cb13d", new Object[]{this, bitmap, view});
                return;
            }
            HashMap hashMap = new HashMap(5);
            if (!(bitmap == null || view == null)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                Context context = view.getContext();
                float n = pr9.n(context, iArr[0]);
                float n2 = pr9.n(context, iArr[1]);
                int n3 = pr9.n(context, view.getWidth());
                int n4 = pr9.n(context, view.getHeight());
                String str = "video_" + System.currentTimeMillis();
                uaw.b().c(str, bitmap);
                hashMap.put("view_x", Float.valueOf(n));
                hashMap.put("view_y", Float.valueOf(n2));
                hashMap.put("view_w", Integer.valueOf(n3));
                hashMap.put("view_h", Integer.valueOf(n4));
                hashMap.put("container_w", Integer.valueOf(n3));
                hashMap.put("container_h", Integer.valueOf(n4));
                hashMap.put("file_name", str);
                ir9.b(ShortVideoWeexV2ModuleProxy.TAG, "videoX=" + n + " " + n2 + " " + n3 + " " + n4 + " ;fileName=" + str);
            }
            this.f7811a.b(MUSValue.ofJSON(hashMap));
        }
    }
}
