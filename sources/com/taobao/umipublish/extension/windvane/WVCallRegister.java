package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.taobao.umipublish.util.RemoteEnvUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.d1a;
import tb.dnu;
import tb.odg;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/WVCallRegister;", "", "<init>", "()V", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WVCallRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WVCallRegister INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Item> f14051a = new LinkedHashMap();

    private WVCallRegister() {
    }

    public static final /* synthetic */ WindvaneCall a(WVCallRegister wVCallRegister, String str, Context context, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindvaneCall) ipChange.ipc$dispatch("a0052ef8", new Object[]{wVCallRegister, str, context, wVCallBackContext});
        }
        return wVCallRegister.c(str, context, wVCallBackContext);
    }

    public final WindvaneCall c(final String str, final Context context, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindvaneCall) ipChange.ipc$dispatch("9b01dfe2", new Object[]{this, str, context, wVCallBackContext});
        }
        final Item item = (Item) ((LinkedHashMap) f14051a).get(str);
        if (item == null) {
            return null;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        dnu.b(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$getWVCall$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Class cls;
                WindvaneCall windvaneCall;
                T t = 0;
                t = 0;
                if (!TextUtils.isEmpty(Item.this.b())) {
                    String b = Item.this.b();
                    if (b != null) {
                        cls = Class.forName(b);
                    } else {
                        cls = null;
                    }
                } else {
                    cls = Item.this.a();
                }
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                if (!(cls == null || (windvaneCall = (WindvaneCall) cls.newInstance()) == null)) {
                    windvaneCall.setContext(wVCallBackContext, context);
                    xhv xhvVar = xhv.INSTANCE;
                    t = windvaneCall;
                }
                ref$ObjectRef2.element = t;
            }
        }, new Runnable() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$getWVCall$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Ref$ObjectRef.this.element = null;
                odg.c(WindvaneCall.TAG, "create windvane call error. actionName:" + str + " className:" + item.b());
                UmiPublishMonitor.w().o(WindvaneCall.TAG, "-1", "create windvane call error", null);
            }
        });
        return (WindvaneCall) ref$ObjectRef.element;
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39adc5b", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "actionName");
        ckf.g(str2, "callClassName");
        e(str, str2, true);
    }

    public final void e(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc161d9", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "actionName");
        ckf.g(str2, "callClassName");
        f14051a.put(str, new Item(str, str2, z, null));
    }

    public final boolean b(String str, JSONObject jSONObject, Context context, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb3debdf", new Object[]{this, str, jSONObject, context, wVCallBackContext})).booleanValue();
        }
        ckf.g(str, "actionName");
        ckf.g(jSONObject, "params");
        ckf.g(context, "context");
        ckf.g(wVCallBackContext, "wvCallBackContext");
        Item item = (Item) ((LinkedHashMap) f14051a).get(str);
        if (item == null) {
            return false;
        }
        if (item.c()) {
            final WVCallRegister$execute$windvaneCall$1 wVCallRegister$execute$windvaneCall$1 = new WVCallRegister$execute$windvaneCall$1(str, context, wVCallBackContext, jSONObject);
            if (RemoteEnvUtil.c("guangguang", false)) {
                wVCallRegister$execute$windvaneCall$1.invoke();
            } else {
                RemoteEnvUtil.a(context, "guangguang", new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.WVCallRegister$execute$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                    public void a(String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c4e0fc68", new Object[]{this, str2, str3});
                        } else {
                            wVCallBackContext.error();
                        }
                    }

                    @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fbd923b9", new Object[]{this});
                        } else {
                            d1a.this.invoke();
                        }
                    }
                });
            }
            return true;
        }
        WindvaneCall c = c(str, context, wVCallBackContext);
        if (c != null) {
            c.call(jSONObject);
        }
        return c != null;
    }

    static {
        t2o.a(944767134);
        WVCallRegister wVCallRegister = new WVCallRegister();
        INSTANCE = wVCallRegister;
        wVCallRegister.d(UmiWvPlugin.OPEN_REEDIT_PAGE, "com.taobao.umipublish.extension.windvane.call.OpenReEditPageCall");
        wVCallRegister.d(UmiWvPlugin.OPEN_ASR_WINDOW, "com.taobao.umipublish.extension.windvane.call.OpenAsrWindowCall");
        wVCallRegister.d(UmiWvPlugin.OPEN_AI_DRESS_ALBUM_PAGE, "com.taobao.umipublish.extension.windvane.call.OpenAIDressAlbumCall");
        wVCallRegister.d(UmiWvPlugin.LINK_PUBLISH_ACTION, "com.taobao.umipublish.extension.windvane.call.LinkPublishCall");
        wVCallRegister.d(UmiWvPlugin.GET_FLOAT_WEB_PAGE_PARAMS, "com.taobao.umipublish.extension.windvane.call.GetFloatWebPageParamsCall");
        wVCallRegister.d(UmiWvPlugin.CLOSE_FLOAT_WEB_PAGE, "com.taobao.umipublish.extension.windvane.call.CloseFloatWebPageCall");
        wVCallRegister.d(UmiWvPlugin.ASYNC_PUBLISH_FIRE_NOTIFICATION, "com.taobao.umipublish.extension.windvane.call.AsyncPublishFireNotificationCall");
        wVCallRegister.d(UmiWvPlugin.ASYNC_PUBLISH_CANCEL, "com.taobao.umipublish.extension.windvane.call.AsyncPublishCancelCall");
        wVCallRegister.d(UmiWvPlugin.OPEN_WEEX_FLOAT_PAGE_ACTION, "com.taobao.umipublish.extension.windvane.call.OpenWeexFloatPageCall");
        wVCallRegister.d(UmiWvPlugin.CLOSE_WEEX_FLOAT_PAGE_ACTION, "com.taobao.umipublish.extension.windvane.call.CloseWeexFloatPageCall");
        wVCallRegister.d(UmiWvPlugin.GET_FLOAT_WEEX_PAGE_PARAMS, "com.taobao.umipublish.extension.windvane.call.GetFloatWeexPageParamsCall");
        wVCallRegister.d(UmiWvPlugin.OPEN_AI_FACE_COLLECTION, "com.taobao.umipublish.extension.windvane.call.OpenAIPhotoFaceCollectionCall");
        wVCallRegister.d(UmiWvPlugin.QUICK_PUBLISH, "com.taobao.umipublish.extension.windvane.call.QuickPublishCall");
    }
}
