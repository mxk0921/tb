package com.taobao.android.dinamicx.muise;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.h36;
import tb.rn6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXCoreRefModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public DXCoreRefModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ DXWidgetNode access$000(DXCoreRefModule dXCoreRefModule, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a8311d4b", new Object[]{dXCoreRefModule, dXWidgetNode, str});
        }
        return dXCoreRefModule.getWidgetNodeByRef(dXWidgetNode, str);
    }

    private DXWidgetNode getWidgetNodeByRef(DXWidgetNode dXWidgetNode, String str) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("b19832b1", new Object[]{this, dXWidgetNode, str});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (str.equals(dXWidgetNode.getRef())) {
            return dXWidgetNode;
        }
        if (dXWidgetNode instanceof DXViewPager) {
            list = ((DXViewPager) dXWidgetNode).y();
        } else {
            list = dXWidgetNode.getChildren();
        }
        if (list == null) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode2 : list) {
            DXWidgetNode widgetNodeByRef = getWidgetNodeByRef(dXWidgetNode2, str);
            if (widgetNodeByRef != null) {
                return widgetNodeByRef;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(DXCoreRefModule dXCoreRefModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/muise/DXCoreRefModule");
    }

    @MUSMethod(uiThread = false)
    public JSONObject callRef(String str, String str2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0562eb8", new Object[]{this, str, str2, jSONArray});
        }
        FutureTask futureTask = new FutureTask(new a(str, str2, jSONArray));
        this.mHandler.post(futureTask);
        try {
            return (JSONObject) futureTask.get(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            h36.c("nativeApi err: timeout");
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Callable<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7327a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONArray c;

        public a(String str, String str2, JSONArray jSONArray) {
            this.f7327a = str;
            this.b = str2;
            this.c = jSONArray;
        }

        /* renamed from: a */
        public JSONObject call() throws Exception {
            DXWidgetNode W;
            DXWidgetNode queryRootWidgetNode;
            DXWidgetNode access$000;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("31a17705", new Object[]{this});
            }
            Object executeContext = DXCoreRefModule.this.getInstance().getExecuteContext();
            if (!(executeContext instanceof DXRuntimeContext) || TextUtils.isEmpty(this.f7327a) || (W = ((DXRuntimeContext) executeContext).W()) == null || (queryRootWidgetNode = W.queryRootWidgetNode()) == null || (access$000 = DXCoreRefModule.access$000(DXCoreRefModule.this, queryRootWidgetNode, this.f7327a)) == null) {
                return null;
            }
            if ("render".equals(this.b)) {
                JSONArray jSONArray = this.c;
                if (jSONArray != null && jSONArray.size() > 0) {
                    Object obj = this.c.get(0);
                    if (obj instanceof JSONObject) {
                        rn6.f((JSONObject) obj, access$000, true);
                    }
                }
            } else if (!"refresh".equals(this.b)) {
                return access$000.invokeRefMethod(this.b, this.c);
            } else {
                JSONArray jSONArray2 = this.c;
                if (jSONArray2 != null && jSONArray2.size() > 0) {
                    Object obj2 = this.c.get(0);
                    if (obj2 instanceof JSONObject) {
                        rn6.e((JSONObject) obj2, access$000, true);
                    }
                }
            }
            return null;
        }
    }
}
