package com.etao.feimagesearch.capture.dynamic.module;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.f48;
import tb.h19;
import tb.i54;
import tb.l53;
import tb.mzu;
import tb.p73;
import tb.pmf;
import tb.pvh;
import tb.r7m;
import tb.t2o;
import tb.u7m;
import tb.v3o;
import tb.v4s;
import tb.xhv;
import tb.xr1;
import tb.zso;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CameraMuiseModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MODULE_NAME = "TBPSCameraModule";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296650);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296649);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraMuiseModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
    }

    public static /* synthetic */ Object ipc$super(CameraMuiseModule cameraMuiseModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/module/CameraMuiseModule");
    }

    @MUSMethod
    public final void cameraChangeMetaSight(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac69e46", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraChangeMetaSight");
            String i = h19.i(jSONObject, "state", "close");
            ckf.f(i, "parseString(params, \"state\", \"close\")");
            boolean equals = TextUtils.equals("open", i);
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.switchMetaSightState(equals);
            }
        }
    }

    @MUSMethod
    public final void cameraChangeScene(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54ecf52", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraChangeScene");
            String i = h19.i(jSONObject, "scene", "");
            if (i != null && i.length() != 0) {
                JSONObject d = h19.d(jSONObject, "requestConfig");
                v3o v3oVar = d != null ? new v3o(h19.i(d, "appId", ""), h19.i(d, "apiName", ""), h19.i(d, "apiVersion", ""), h19.i(d, "component", "")) : null;
                l53.d dVar = l53.Companion;
                Context a2 = getInstance().getContext().a();
                ckf.f(a2, "instance.context.uiContext");
                xr1 a3 = dVar.a(a2);
                if (a3 != null) {
                    a3.changeScene(new zso(i, v3oVar));
                }
            }
        }
    }

    @MUSMethod
    public final void cameraClickBack() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4075071", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraClickBack");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null && (activity = a3.getActivity()) != null) {
            activity.finish();
        }
    }

    @MUSMethod
    public final void cameraClickFlip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f418f7", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraClickFlip");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.flipCamera();
        }
    }

    @MUSMethod
    public final void cameraClickHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b14b9b8", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraClickHistory");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.clickHistory();
        }
    }

    @MUSMethod
    public final void cameraClickPhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d861796", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraClickPhoto");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.clickAlbum();
        }
    }

    @MUSMethod
    public final void cameraJumpToIrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b33830", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraJumpToIrp");
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.jumpToIrp(jSONObject);
            }
        }
    }

    @MUSMethod
    public final void cameraOuterAlbumClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b90f5a", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraOuterAlbumClick");
            MusOuterAlbumBean a2 = MusOuterAlbumBean.Companion.a(jSONObject);
            if (a2 != null) {
                l53.d dVar = l53.Companion;
                Context a3 = getInstance().getContext().a();
                ckf.f(a3, "instance.context.uiContext");
                xr1 a4 = dVar.a(a3);
                if (a4 != null) {
                    a4.outerAlbumClick(a2);
                }
            }
        }
    }

    @MUSMethod
    public final void cameraSceneContinue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d28bb5", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraSceneContinue");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.continueCameraScene();
        }
    }

    @MUSMethod
    public final void cameraScenePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a174ed6", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraScenePause");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.stopCameraScene();
        }
    }

    @MUSMethod
    public final void cameraSceneResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d31c9fb", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraSceneResume");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.continueCameraScene();
        }
    }

    @MUSMethod
    public final void cameraSceneStop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ebbfe0", new Object[]{this, jSONObject});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraSceneStop");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.stopCameraScene();
        }
    }

    @MUSMethod
    public final void changeScanMode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114b27b9", new Object[]{this, jSONObject});
        }
    }

    @MUSMethod
    public final void requestFloatingWindowPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087763b", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "requestFloatingWindowPermission");
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.requestFloatingWindowPermission();
        }
    }

    @MUSMethod
    public final void cameraClickTakePhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193af44f", new Object[]{this});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "cameraClickTakePhoto");
        pmf.I0();
        mzu.n(p73.f25916a, "takePhotoByFrontend", 19999, new String[0]);
        l53.d dVar = l53.Companion;
        Context a2 = getInstance().getContext().a();
        ckf.f(a2, "instance.context.uiContext");
        xr1 a3 = dVar.a(a2);
        if (a3 != null) {
            a3.takePhoto();
        }
    }

    @MUSMethod(uiThread = true)
    public final void cameraSwitch(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d46a242", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraSwitch");
            boolean b = ckf.b("open", h19.i(jSONObject, "state", "open"));
            boolean e = h19.e(jSONObject, "isFront", false);
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.cameraSwitch(b, e, new i54(pvhVar, pvhVar2));
            }
        }
    }

    @MUSMethod
    public final void optionFloatingBtnState(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ced3a2", new Object[]{this, jSONObject, pvhVar});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "optionFloatingBtnState");
            boolean e = h19.e(jSONObject, "isShow", false);
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.optionScreenShotSearchFloatingBtn(e, pvhVar);
            }
        }
    }

    @MUSMethod
    public final void cameraClickLight(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d135b6", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "cameraClickLight");
            if (ckf.b(h19.i(jSONObject, "state", ""), "open")) {
                l53.d dVar = l53.Companion;
                Context a2 = getInstance().getContext().a();
                ckf.f(a2, "instance.context.uiContext");
                xr1 a3 = dVar.a(a2);
                if (a3 != null) {
                    a3.operateLight(true);
                    return;
                }
                return;
            }
            l53.d dVar2 = l53.Companion;
            Context a4 = getInstance().getContext().a();
            ckf.f(a4, "instance.context.uiContext");
            xr1 a5 = dVar2.a(a4);
            if (a5 != null) {
                a5.operateLight(false);
            }
        }
    }

    @MUSMethod
    public final void getDebugInfo(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cf7db", new Object[]{this, pvhVar});
            return;
        }
        agh.r("PltCameraPai", MODULE_NAME, "getDebugInfo");
        if (pvhVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) v4s.PARAM_IS_DEBUG, (String) Boolean.valueOf(caa.q()));
            xhv xhvVar = xhv.INSTANCE;
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public final void getPicData(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9684037d", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (jSONObject != null && pvhVar != null) {
            agh.r("PltCameraPai", MODULE_NAME, "getPicData");
            DynCaptureImgGotConfig d = DynCaptureImgGotConfig.d(jSONObject, new i54(pvhVar, pvhVar2));
            if (d == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "errorCode", (String) (-1));
                jSONObject2.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (pvhVar2 != null) {
                    pvhVar2.b(jSONObject2);
                    return;
                }
                return;
            }
            new f48(d).a();
        }
    }

    @MUSMethod
    public final void getPreviewData(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2778ff", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (jSONObject != null && pvhVar != null) {
            agh.r("PltCameraPai", MODULE_NAME, "getPreviewData");
            DynCaptureImgGotConfig c = DynCaptureImgGotConfig.c(jSONObject, new i54(pvhVar, pvhVar2));
            if (c == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "errorCode", (String) (-1));
                jSONObject2.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (pvhVar2 != null) {
                    pvhVar2.b(jSONObject2);
                    return;
                }
                return;
            }
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.getPreviewData(c, new i54(pvhVar, pvhVar2));
            }
        }
    }

    @MUSMethod
    public final void requireFloatingWindowPermissionState(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4845f817", new Object[]{this, pvhVar});
        } else if (pvhVar != null) {
            agh.r("PltCameraPai", MODULE_NAME, "requireFloatingWindowPermissionState");
            boolean f = u7m.f();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", (String) Integer.valueOf(f ? 1 : 0));
            xhv xhvVar = xhv.INSTANCE;
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod
    public final void selectPhotoFromAlbum(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20ce8cc", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (jSONObject != null && pvhVar != null) {
            agh.r("PltCameraPai", MODULE_NAME, "selectPhotoFromAlbum");
            DynCaptureImgGotConfig b = DynCaptureImgGotConfig.b(jSONObject, new i54(pvhVar, pvhVar2));
            if (b == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "errorCode", (String) (-1));
                jSONObject2.put((JSONObject) "errorMessage", "Img Config Parse Error");
                if (pvhVar2 != null) {
                    pvhVar2.b(jSONObject2);
                    return;
                }
                return;
            }
            l53.d dVar = l53.Companion;
            Context a2 = getInstance().getContext().a();
            ckf.f(a2, "instance.context.uiContext");
            xr1 a3 = dVar.a(a2);
            if (a3 != null) {
                a3.selectPhotoFromAlbum(b);
            }
        }
    }

    @MUSMethod
    public final void updateAllowanceState(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32899030", new Object[]{this, jSONObject, pvhVar});
        } else if (jSONObject != null) {
            agh.r("PltCameraPai", MODULE_NAME, "updateAllowanceState");
            Boolean bool = null;
            if (h19.e(jSONObject, "isShow", false)) {
                r7m a2 = r7m.Companion.a(h19.d(jSONObject, "data"));
                if (a2 != null) {
                    l53.d dVar = l53.Companion;
                    Context a3 = getInstance().getContext().a();
                    ckf.f(a3, "instance.context.uiContext");
                    xr1 a4 = dVar.a(a3);
                    if (a4 != null) {
                        bool = Boolean.valueOf(a4.updateAllowanceState(a2, true));
                    }
                } else {
                    return;
                }
            } else {
                l53.d dVar2 = l53.Companion;
                Context a5 = getInstance().getContext().a();
                ckf.f(a5, "instance.context.uiContext");
                xr1 a6 = dVar2.a(a5);
                if (a6 != null) {
                    bool = Boolean.valueOf(a6.updateAllowanceState(null, false));
                }
            }
            if (pvhVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "success", (String) bool);
                xhv xhvVar = xhv.INSTANCE;
                pvhVar.b(jSONObject2);
            }
        }
    }
}
