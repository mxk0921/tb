package com.taobao.android.weex.bridge;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.ali.user.mobile.rpc.ApiConstants;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.util.WeexInstanceChecker;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;
import tb.bde;
import tb.dwh;
import tb.f7l;
import tb.g7x;
import tb.hxh;
import tb.q6x;
import tb.t2o;
import tb.u8x;
import tb.v3x;
import tb.vvh;
import tb.x8x;
import tb.xpc;
import tb.yio;
import tb.z9x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformInstanceBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InstanceBridge";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexInstanceImpl d;
        public final /* synthetic */ String e;

        public a(WeexInstanceImpl weexInstanceImpl, String str) {
            this.d = weexInstanceImpl;
            this.e = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformInstanceBridge$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                Toast.makeText(this.d.getContext(), this.e, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexInstanceImpl d;
        public final /* synthetic */ String e;

        public b(WeexInstanceImpl weexInstanceImpl, String str) {
            this.d = weexInstanceImpl;
            this.e = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformInstanceBridge$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            try {
                try {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.d.getContext());
                    builder.setTitle("WeexDebug(id: " + this.d.getInstanceId() + f7l.BRACKET_END_STR);
                    builder.setMessage(this.e);
                    builder.show();
                } catch (Exception unused) {
                    dwh.f(ApiConstants.ResultActionType.ALERT, "WeexDebug(id: " + this.d.getInstanceId() + "): " + this.e);
                    Toast.makeText(this.d.getContext(), "Weex出现报错, 请查看Log", 0).show();
                }
            } catch (Exception unused2) {
                Activity e = WeexInstanceChecker.h().e();
                if (e != null) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(e);
                    builder2.setTitle("WeexDebug(id: " + this.d.getInstanceId() + f7l.BRACKET_END_STR);
                    builder2.setMessage(this.e);
                    builder2.show();
                    return;
                }
                dwh.f(ApiConstants.ResultActionType.ALERT, "WeexDebug(id: " + this.d.getInstanceId() + "): " + this.e);
                Toast.makeText(this.d.getContext(), "Weex出现报错, 请查看Log", 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexInstanceImpl d;
        public final /* synthetic */ String e;

        public c(WeexInstanceImpl weexInstanceImpl, String str) {
            this.d = weexInstanceImpl;
            this.e = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/bridge/WeexPlatformInstanceBridge$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                this.d.debugShowInstanceTag(this.e);
            }
        }
    }

    static {
        t2o.a(982515840);
    }

    public static void ApmAddProperty(WeexInstanceImpl weexInstanceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefe0690", new Object[]{weexInstanceImpl, new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
                return;
            }
            v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.c().b(WMInstanceApm.k(i), str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void ApmAddStage(WeexInstanceImpl weexInstanceImpl, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf67e581", new Object[]{weexInstanceImpl, new Integer(i), new Long(j)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
                return;
            }
            v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.c().d(WMInstanceApm.l(i), j);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void ApmAddStageByKey(WeexInstanceImpl weexInstanceImpl, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2820dc8", new Object[]{weexInstanceImpl, str, new Long(j)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
                return;
            }
            v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.c().d(str, j);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void ApmFinish(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a11016", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
                return;
            }
            v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.c().f();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static WeexValue CallMega(WeexInstanceImpl weexInstanceImpl, boolean z, String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("4c623fa6", new Object[]{weexInstanceImpl, new Boolean(z), str, str2, weexValueArr});
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "callModule instance is null");
                return null;
            }
            u8x.g("WXCallMega", str, str2);
            WeexValue callMega = weexInstanceImpl.callMega(z, str, str2, weexValueArr);
            u8x.h();
            return callMega;
        } catch (Exception e) {
            dwh.i(e);
            return null;
        }
    }

    public static WeexValue CallModule(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("2d59d296", new Object[]{weexInstanceImpl, str, str2, weexValueArr});
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "callModule instance is null");
                return null;
            } else if (z9x.b(str)) {
                return z9x.a(str, str2, weexValueArr);
            } else {
                u8x.g("WXCallModule", str, str2);
                WeexValue callModule = weexInstanceImpl.callModule(str, str2, weexValueArr);
                z9x.d(weexInstanceImpl.getInstanceId(), xpc.RECORD_CALLMODULEMETHOD, str, str2, weexValueArr, callModule);
                u8x.h();
                return callModule;
            }
        } catch (Exception e) {
            dwh.i(e);
            return null;
        }
    }

    public static void CallSnapshot(WeexInstanceImpl weexInstanceImpl, ByteBuffer byteBuffer, int i, int i2, int i3, double d, double d2, double d3, double d4) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a788a39", new Object[]{weexInstanceImpl, byteBuffer, new Integer(i), new Integer(i2), new Integer(i3), new Double(d), new Double(d2), new Double(d3), new Double(d4)});
        } else if (weexInstanceImpl != null) {
            q6x q6xVar = (q6x) weexInstanceImpl.getExtend(q6x.class);
            if (q6xVar instanceof x8x) {
                if (byteBuffer != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.RGB_565);
                    createBitmap.copyPixelsFromBuffer(byteBuffer);
                    bitmap = createBitmap;
                } else {
                    bitmap = null;
                }
                ((x8x) q6xVar).z(bitmap, i, i2, i3, d, d2, d3, d4);
            }
        }
    }

    public static void DebugShowInstanceTag(WeexInstanceImpl weexInstanceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f76d04", new Object[]{weexInstanceImpl, str});
            return;
        }
        try {
            hxh.f(new c(weexInstanceImpl, str));
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void EnterMacroScope(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8865", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else if (weexInstanceImpl instanceof WeexMUSInstance) {
                ((WeexMUSInstance) weexInstanceImpl).enterMacroScope();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void ExitMacroScope(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab054eb", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else if (weexInstanceImpl instanceof WeexMUSInstance) {
                ((WeexMUSInstance) weexInstanceImpl).exitMacroScope();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static WeexValue GetEnvironment(WeexInstanceImpl weexInstanceImpl, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("79a077f8", new Object[]{weexInstanceImpl, new Boolean(z), str});
        }
        try {
            if (z) {
                Object obj = vvh.h().get(str);
                if (obj == null) {
                    return WeexValueImpl.ofUndefined();
                }
                return WeexValueImpl.convert(obj);
            }
            WeexValue instanceEnv = weexInstanceImpl.getInstanceEnv(str);
            if (instanceEnv == null) {
                return WeexValueImpl.ofUndefined();
            }
            return instanceEnv;
        } catch (Exception e) {
            dwh.i(e);
            return WeexValueImpl.ofUndefined();
        }
    }

    public static WeexValue GetWeexEnvironmentKeys(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("49d1b431", new Object[]{weexInstanceImpl});
        }
        try {
            Set<String> keySet = vvh.h().keySet();
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(keySet);
            return WeexValueImpl.ofJSONArray(jSONArray);
        } catch (Exception e) {
            dwh.i(e);
            return WeexValueImpl.ofUndefined();
        }
    }

    public static void MakeActivityPause(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79aae9e", new Object[]{weexInstanceImpl});
        }
    }

    public static void MakeActivityResume(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65121def", new Object[]{weexInstanceImpl});
        }
    }

    public static void MakeActivityStart(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3370f00a", new Object[]{weexInstanceImpl});
        }
    }

    public static void MakeActivityStop(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b0444", new Object[]{weexInstanceImpl});
        }
    }

    public static void MakeAlert(WeexInstanceImpl weexInstanceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3112ec1d", new Object[]{weexInstanceImpl, str});
            return;
        }
        try {
            if (vvh.m()) {
                hxh.f(new b(weexInstanceImpl, str));
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static WeexValue MakeSnapshot(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("8156d4d3", new Object[]{weexInstanceImpl});
        }
        return null;
    }

    public static void MakeToast(WeexInstanceImpl weexInstanceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9420e8", new Object[]{weexInstanceImpl, str});
            return;
        }
        try {
            if (vvh.m()) {
                hxh.f(new a(weexInstanceImpl, str));
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void MonitorCommitMusTime(WeexInstanceImpl weexInstanceImpl, int i, int i2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab6e12", new Object[]{weexInstanceImpl, new Integer(i), new Integer(i2), new Double(d)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else if (weexInstanceImpl instanceof WeexMUSInstance) {
                ((WeexMUSInstance) weexInstanceImpl).monitorCommitTime(i, g7x.b[i2], (long) d);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void MonitorUpdateMusDim(WeexInstanceImpl weexInstanceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e308", new Object[]{weexInstanceImpl, new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else if (weexInstanceImpl instanceof WeexMUSInstance) {
                ((WeexMUSInstance) weexInstanceImpl).monitorUpdateDim(g7x.f19779a[i], str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnDestroy(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610c7b60", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.onDestroy();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnDestroyStart(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dffb858c", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.onDestroyStart();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnEngineException(WeexInstanceImpl weexInstanceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db55d9da", new Object[]{weexInstanceImpl, new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.engineException(i, str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnExecuteFailed(WeexInstanceImpl weexInstanceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b378e55", new Object[]{weexInstanceImpl, new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.executeFailed(i, str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnExecuteSucceed(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7107e991", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.executeSucceed();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnInitFailed(WeexInstanceImpl weexInstanceImpl, boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6523b5aa", new Object[]{weexInstanceImpl, new Boolean(z), new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.initFailed(z, i, str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnInitSucceed(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396769dc", new Object[]{weexInstanceImpl, new Boolean(z)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.initSucceed(z);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnJSDestroyPostDone(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf8d059", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.onJSDestroyPostDone();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnRenderFailed(WeexInstanceImpl weexInstanceImpl, boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb431070", new Object[]{weexInstanceImpl, new Boolean(z), new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.renderFailed(z, i, str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnRenderSucceed(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d80a22", new Object[]{weexInstanceImpl, new Boolean(z)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.renderSucceed(z);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnRenderSuccessJSThread(WeexInstanceImpl weexInstanceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1eb672e", new Object[]{weexInstanceImpl, new Boolean(z)});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else if (weexInstanceImpl instanceof WeexMUSInstance) {
                ((WeexMUSInstance) weexInstanceImpl).onRenderSuccessJSThread(z);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void OnScriptException(WeexInstanceImpl weexInstanceImpl, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e551123", new Object[]{weexInstanceImpl, new Integer(i), str});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.scriptException(i, str);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void RUMFinish(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afe2e82", new Object[]{weexInstanceImpl});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
                return;
            }
            v3x v3xVar = (v3x) weexInstanceImpl.getExtend(v3x.class);
            if (v3xVar != null) {
                v3xVar.c().g();
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void ReportUnicornScreenInfo(WeexInstanceImpl weexInstanceImpl, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d6ff89", new Object[]{weexInstanceImpl, weexValue});
        } else {
            weexInstanceImpl.reportUnicornScreenInfo(weexValue.toJSONObjectOrNullSafe());
        }
    }

    public static void SetViewFrame(WeexInstanceImpl weexInstanceImpl, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc3760b", new Object[]{weexInstanceImpl, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public static void UpdateInstanceInfo(WeexInstanceImpl weexInstanceImpl, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b196611", new Object[]{weexInstanceImpl, str, weexValue});
            return;
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "instance is null");
            } else {
                weexInstanceImpl.updateInstanceInfo(str, (WeexValueImpl) weexValue);
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static void createAppContext(long j, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7fe2b9", new Object[]{new Long(j), weexValue});
            return;
        }
        try {
            nativeCreateAppContext(j, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static long createInstance(WeexInstance weexInstance, String str, String str2, int i, int i2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3abb376", new Object[]{weexInstance, str, str2, new Integer(i), new Integer(i2), weexValue})).longValue();
        }
        try {
            return nativeCreateInstance(weexInstance.getInstanceId(), str, str2, i, i2, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
            return 0L;
        }
    }

    public static long createInstanceChild(WeexInstance weexInstance, String str, String str2, int i, long j, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2faee99b", new Object[]{weexInstance, str, str2, new Integer(i), new Long(j), weexValue})).longValue();
        }
        try {
            return nativeCreateInstanceChild(weexInstance.getInstanceId(), str, str2, i, j, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
            return 0L;
        }
    }

    public static long createInstanceEmbed(WeexInstance weexInstance, String str, String str2, long j, int i, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ec9ab60", new Object[]{weexInstance, str, str2, new Long(j), new Integer(i), weexValue})).longValue();
        }
        try {
            return nativeCreateInstanceEmbed(weexInstance.getInstanceId(), str, str2, j, i, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
            return 0L;
        }
    }

    public static void destroy(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececf63", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeDestroy(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void dispatchEvent(long j, int i, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f91ea7c", new Object[]{new Long(j), new Integer(i), str, weexValue});
            return;
        }
        try {
            nativeDispatchEvent(j, i, str, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void dumpRenderTree(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954cc0b5", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeDumpRenderTree(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.h("dumpEngine error", e);
        }
    }

    public static void execute(long j, byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0565399", new Object[]{new Long(j), bArr, str});
            return;
        }
        try {
            nativeExecute(j, WeexValueImpl.ofArrayBuffer(bArr), str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void finalizeCInstance(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d8c7c3", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeFinalizeCInstance(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void fireEvent(long j, int i, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595cbc38", new Object[]{new Long(j), new Integer(i), str, weexValue});
            return;
        }
        try {
            nativeFireEvent(j, i, str, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void getEngineInfoAsync(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb1f67", new Object[]{new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        try {
            nativeGetEngineInfoAsync(j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void getEngineInfoAsyncCallback(int i, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37fad2b", new Object[]{new Integer(i), weexValue});
            return;
        }
        try {
            WeexInstanceImpl.getEngineInfoAsyncCallback(i, weexValue);
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static ArrayList<String> getRenderEngineOptions(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8149bba7", new Object[]{new Long(j)});
        }
        try {
            WeexValue nativeGetRenderEngineOptions = nativeGetRenderEngineOptions(j);
            if (nativeGetRenderEngineOptions != null && nativeGetRenderEngineOptions.isArray()) {
                ArrayList<String> arrayList = new ArrayList<>();
                JSONArray array = nativeGetRenderEngineOptions.getArray();
                for (int i = 0; i < array.size(); i++) {
                    arrayList.add(array.getString(i));
                }
                return arrayList;
            }
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
        return new ArrayList<>();
    }

    public static void getSnapshot(long j, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e973741e", new Object[]{new Long(j), str, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            nativeGetSnapshot(j, str, i, z);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void initAfterCreate(long j, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38288b3", new Object[]{new Long(j), weexInstance});
            return;
        }
        try {
            nativeInitAfterCreate(j, weexInstance);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void initWithData(long j, byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb00aae", new Object[]{new Long(j), bArr, str});
            return;
        }
        try {
            nativeInitWithData(j, WeexValueImpl.ofArrayBuffer(bArr), str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void initWithEmpty(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49732886", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeInitWithEmpty(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void initWithURL(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842307ee", new Object[]{new Long(j), str});
            return;
        }
        try {
            nativeInitWithURL(j, str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void invokeCallback(long j, int i, WeexValue[] weexValueArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dac3d1a", new Object[]{new Long(j), new Integer(i), weexValueArr, new Boolean(z)});
            return;
        }
        try {
            nativeInvokeCallback(j, i, weexValueArr, z);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static boolean isSettingEnable(long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b99e37fa", new Object[]{new Long(j), str, new Boolean(z)})).booleanValue();
        }
        try {
            return nativeIsSettingEnable(j, str, z);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
            return z;
        }
    }

    public static void legacyCallNativeUINode(long j, int i, String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5442769b", new Object[]{new Long(j), new Integer(i), str, weexValueArr});
            return;
        }
        try {
            nativeLegacyCallNativeUINode(j, i, str, weexValueArr);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void legacyDispatchWindVaneEvent(long j, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fe9b92", new Object[]{new Long(j), str, weexValue});
            return;
        }
        try {
            nativeLegacyDispatchWindVaneEvent(j, str, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void legacyFireGlobalEvent(long j, String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f406ff66", new Object[]{new Long(j), str, weexValueArr});
            return;
        }
        try {
            nativeLegacyFireGlobalEvent(j, str, weexValueArr);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void musDirtyNodeAndReLayout(long j, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beda80a3", new Object[]{new Long(j), new Integer(i), new Boolean(z)});
            return;
        }
        try {
            nativeMusDirtyNodeAndReLayout(j, i, z);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    private static native void nativeCreateAppContext(long j, WeexValue weexValue);

    private static native long nativeCreateInstance(int i, String str, String str2, int i2, int i3, WeexValue weexValue);

    private static native long nativeCreateInstanceChild(int i, String str, String str2, int i2, long j, WeexValue weexValue);

    private static native long nativeCreateInstanceChildWithRenderInstance(int i, String str, String str2, int i2, long j, WeexValue weexValue, long j2, int i3);

    private static native long nativeCreateInstanceEmbed(int i, String str, String str2, long j, int i2, WeexValue weexValue);

    private static native void nativeDestroy(long j);

    private static native void nativeDispatchEvent(long j, int i, String str, WeexValue weexValue);

    private static native void nativeDumpRenderTree(long j);

    private static native void nativeExecute(long j, WeexValue weexValue, String str);

    private static native void nativeFinalizeCInstance(long j);

    private static native void nativeFireEvent(long j, int i, String str, WeexValue weexValue);

    private static native void nativeGetEngineInfoAsync(long j, int i, int i2);

    private static native WeexValue nativeGetRenderEngineOptions(long j);

    private static native void nativeGetSnapshot(long j, String str, int i, boolean z);

    private static native void nativeInitAfterCreate(long j, WeexInstance weexInstance);

    private static native void nativeInitWithData(long j, WeexValue weexValue, String str);

    private static native void nativeInitWithEmpty(long j);

    private static native void nativeInitWithURL(long j, String str);

    private static native void nativeInvokeCallback(long j, int i, WeexValue[] weexValueArr, boolean z);

    private static native boolean nativeIsSettingEnable(long j, String str, boolean z);

    private static native void nativeLegacyCallNativeUINode(long j, int i, String str, WeexValue[] weexValueArr);

    private static native void nativeLegacyDispatchWindVaneEvent(long j, String str, WeexValue weexValue);

    private static native void nativeLegacyFireGlobalEvent(long j, String str, WeexValue[] weexValueArr);

    private static native void nativeMusDirtyNodeAndReLayout(long j, int i, boolean z);

    private static native void nativeOnRootViewFirstAdded(long j);

    private static native void nativePageHide(long j);

    private static native void nativePageShow(long j);

    private static native void nativeRegisterCSSRuleInJSThread(long j, String str, WeexValue weexValue);

    private static native void nativeRegisterSourceMapURL(long j, String str, String str2);

    private static native void nativeRemoveCallback(long j, int i);

    private static native void nativeRender(long j, WeexValue weexValue);

    private static native void nativeReportTaskLog(long j, int i, String str);

    private static native void nativeScriptOnlyDispatchEvent(long j, String str, WeexValue weexValue);

    private static native void nativeScriptOnlyExecute(long j, WeexValue[] weexValueArr);

    private static native void nativeScriptOnlyRegister(long j, String str, String str2);

    private static native void nativeSendInstanceMessage(long j, String str, String str2, WeexValue weexValue);

    private static native void nativeSetInstanceData(long j, WeexValue weexValue);

    private static native void nativeUpdateApmStage(long j, int i, double d);

    private static native void nativeUpdateBaseFontSize(long j, float f);

    private static native void nativeUpdateBundleUrl(long j, String str);

    private static native void nativeUpdateContainerSize(long j, float f, float f2);

    private static native void nativeUpdateEnvironments(long j, int i, WeexValue weexValue, int i2);

    private static native void nativeUpdateInstanceData(long j, String str, String str2, WeexValue weexValue);

    private static native void nativeUpdateInstanceEnv(long j, String str);

    private static native void nativeUpdateRTL(long j, boolean z);

    private static native void nativeUpdateRenderEnvironments(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7);

    private static native void nativeUpdateScreenSize(long j, float f, float f2, float f3);

    private static native void nativeViewAppear(long j);

    private static native void nativeViewDisappear(long j);

    public static void onRootViewFirstAdded(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec32ba67", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeOnRootViewFirstAdded(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void pageHide(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341ecd4c", new Object[]{new Long(j)});
            return;
        }
        try {
            nativePageHide(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void pageShow(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fca2c71", new Object[]{new Long(j)});
            return;
        }
        try {
            nativePageShow(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static void registerCSSRuleInJSThread(long j, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c32b1f9", new Object[]{new Long(j), str, weexValue});
            return;
        }
        try {
            nativeRegisterCSSRuleInJSThread(j, str, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void registerSourceMapURL(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bd5820", new Object[]{new Long(j), str, str2});
            return;
        }
        try {
            nativeRegisterSourceMapURL(j, str, str2);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void removeCallback(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a29f9af", new Object[]{new Long(j), new Integer(i)});
            return;
        }
        try {
            nativeRemoveCallback(j, i);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void render(long j, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c39e5", new Object[]{new Long(j), weexValue});
            return;
        }
        try {
            nativeRender(j, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void reportTaskLog(long j, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3c627b", new Object[]{new Long(j), new Integer(i), str});
            return;
        }
        try {
            nativeReportTaskLog(j, i, str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void scriptOnlyDispatchEvent(long j, String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd24c8ae", new Object[]{new Long(j), str, weexValue});
            return;
        }
        try {
            nativeScriptOnlyDispatchEvent(j, str, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void scriptOnlyExecute(long j, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f6e9d6", new Object[]{new Long(j), weexValueArr});
            return;
        }
        try {
            nativeScriptOnlyExecute(j, weexValueArr);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void scriptOnlyRegister(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27221817", new Object[]{new Long(j), str, str2});
            return;
        }
        try {
            nativeScriptOnlyRegister(j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void sendInstanceMessage(long j, String str, String str2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c6d45", new Object[]{new Long(j), str, str2, weexValue});
            return;
        }
        try {
            nativeSendInstanceMessage(j, str, str2, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void setInstanceData(long j, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418a44b0", new Object[]{new Long(j), weexValue});
            return;
        }
        try {
            nativeSetInstanceData(j, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateApmStage(long j, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da45ef", new Object[]{new Long(j), new Integer(i), new Double(d)});
            return;
        }
        try {
            nativeUpdateApmStage(j, i, d);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateBaseFontSize(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc803b0d", new Object[]{new Long(j), new Float(f)});
            return;
        }
        try {
            nativeUpdateBaseFontSize(j, f);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateBundleUrl(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972eb463", new Object[]{new Long(j), str});
            return;
        }
        try {
            nativeUpdateBundleUrl(j, str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateContainerSize(long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59ad3e4", new Object[]{new Long(j), new Float(f), new Float(f2)});
            return;
        }
        try {
            nativeUpdateContainerSize(j, f, f2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateEnvironments(long j, int i, WeexValue weexValue, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55657b66", new Object[]{new Long(j), new Integer(i), weexValue, new Integer(i2)});
            return;
        }
        try {
            nativeUpdateEnvironments(j, i, weexValue, i2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateInstanceData(long j, String str, String str2, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df20d483", new Object[]{new Long(j), str, str2, weexValue});
            return;
        }
        try {
            nativeUpdateInstanceData(j, str, str2, weexValue);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateInstanceEnv(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859bef38", new Object[]{new Long(j), str});
            return;
        }
        try {
            nativeUpdateInstanceEnv(j, str);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateRTL(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69660b78", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        try {
            nativeUpdateRTL(j, z);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateRenderEnvironments(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9452a6e0", new Object[]{new Long(j), new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7)});
            return;
        }
        try {
            nativeUpdateRenderEnvironments(j, d, d2, d3, d4, d5, d6, d7);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void updateScreenSize(long j, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659011b9", new Object[]{new Long(j), new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        try {
            nativeUpdateScreenSize(j, f, f2, f3);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void viewAppear(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14baaec3", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeViewAppear(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void viewDisappear(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0daa35f", new Object[]{new Long(j)});
            return;
        }
        try {
            nativeViewDisappear(j);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static long createInstanceChild(WeexInstance weexInstance, String str, String str2, int i, long j, WeexValue weexValue, long j2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffa9f09a", new Object[]{weexInstance, str, str2, new Integer(i), new Long(j), weexValue, new Long(j2), new Integer(i2)})).longValue();
        }
        try {
            return nativeCreateInstanceChildWithRenderInstance(weexInstance.getInstanceId(), str, str2, i, j, weexValue, j2, i2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
            return 0L;
        }
    }

    public static WeexValue RequireModule(WeexInstanceImpl weexInstanceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("cea2a2bc", new Object[]{weexInstanceImpl, str});
        }
        try {
            if (weexInstanceImpl == null) {
                dwh.f(TAG, "renderSuccess instance is null");
                return WeexValueImpl.ofUndefined();
            }
            bde d = weexInstanceImpl.getInstanceConfig().d();
            if (d != null && !d.a(str)) {
                return WeexValueImpl.ofUndefined();
            }
            if (z9x.c()) {
                return z9x.e(str);
            }
            WeexValue requireModule = weexInstanceImpl.requireModule(str);
            z9x.d(weexInstanceImpl.getInstanceId(), "requireModule", str, requireModule);
            return requireModule;
        } catch (Exception e) {
            dwh.i(e);
            return WeexValueImpl.ofUndefined();
        }
    }
}
