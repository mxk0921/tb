package com.taobao.android.weex_uikit.bridge;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.div.Div;
import java.io.Serializable;
import java.util.concurrent.Executor;
import tb.cvu;
import tb.dwh;
import tb.hkj;
import tb.ivu;
import tb.nxh;
import tb.t2o;
import tb.u8x;
import tb.wvh;
import tb.yio;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSUINodeBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = MUSDKInstance.class.getSimpleName();
    private static final Runnable OOM_DETECTOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            System.gc();
            Log.e(dwh.TAG, "Weex OOM WTF detector alloc: " + new Object());
            synchronized (MUSUINodeBridge.access$000()) {
                MUSUINodeBridge.access$000().notify();
            }
            Log.e(dwh.TAG, "Weex OOM WTF detector finished");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue e;

        public b(UINode uINode, MUSValue mUSValue) {
            this.d = uINode;
            this.e = mUSValue;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/bridge/MUSUINodeBridge$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                this.d.addEvent(this.e.getStringValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue e;

        public c(UINode uINode, MUSValue mUSValue) {
            this.d = uINode;
            this.e = mUSValue;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/bridge/MUSUINodeBridge$3");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                this.d.removeEvent(this.e.getStringValue());
            }
        }
    }

    static {
        t2o.a(986710023);
    }

    public static /* synthetic */ Runnable access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("fae3e4bd", new Object[0]);
        }
        return OOM_DETECTOR;
    }

    public static void addChildNode(MUSDKInstance mUSDKInstance, UINode uINode, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29d0f52", new Object[]{mUSDKInstance, uINode, uINode2});
        } else if (!mUSDKInstance.isDestroyed()) {
            uINode.addChild(uINode2);
        }
    }

    public static void addChildNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df7f99a", new Object[]{weexInstanceImpl, uINode, uINode2});
        } else {
            addChildNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, uINode2);
        }
    }

    public static void addNodeEvent(MUSDKInstance mUSDKInstance, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bddb9d", new Object[]{mUSDKInstance, uINode, mUSValue});
        } else if (mUSValue != null) {
            try {
                if (!TextUtils.isEmpty(mUSValue.getStringValue())) {
                    mUSDKInstance.enqueueTask(new b(uINode, mUSValue));
                }
            } catch (Exception e) {
                wvh.a().b("MUSUINodeBridge.addNodeEvent", e);
                dwh.g("[Render]", "Client native error occur", e);
            }
        }
    }

    public static void addNodeEvent2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a6fd5", new Object[]{weexInstanceImpl, uINode, mUSValue});
        } else {
            addNodeEvent(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSValue);
        }
    }

    public static void beginUpdate(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40648bd", new Object[]{mUSDKInstance});
            return;
        }
        try {
            if (mUSDKInstance.getRenderManager() != null) {
                mUSDKInstance.getRenderManager().h(mUSDKInstance);
            }
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.beginUpdate", e);
            dwh.i(e);
        }
    }

    public static void beginUpdate2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73618145", new Object[]{weexInstanceImpl});
        } else {
            beginUpdate(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void callUINodeMethod(MUSDKInstance mUSDKInstance, UINode uINode, MUSValue mUSValue, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5fa507", new Object[]{mUSDKInstance, uINode, mUSValue, mUSValueArr});
            return;
        }
        try {
            if (mUSDKInstance == null) {
                dwh.f(TAG, "callUINodeMethod instance is null");
            } else if (uINode.isGenerated()) {
                try {
                    uINode.dispatchMethod(mUSValue.getStringValue(), mUSValueArr);
                } catch (Exception e) {
                    wvh.a().b("MUSDKInstance.callUINodeMethod", e);
                    dwh.i(e);
                }
            } else {
                new hkj(mUSDKInstance).a(uINode, mUSValue, mUSValueArr);
            }
        } catch (Exception e2) {
            wvh.a().b("MUSInstanceBridge.callUINodeMethod", e2);
            dwh.i(e2);
        }
    }

    public static void callUINodeMethod2(WeexInstanceImpl weexInstanceImpl, UINode uINode, String str, WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14da45c7", new Object[]{weexInstanceImpl, uINode, str, weexValueArr});
            return;
        }
        MUSValue[] mUSValueArr = null;
        if (weexValueArr != null) {
            MUSValue[] mUSValueArr2 = new MUSValue[weexValueArr.length];
            for (int i = 0; i < weexValueArr.length; i++) {
                WeexValue weexValue = weexValueArr[i];
                if (weexValue == null) {
                    mUSValueArr2[i] = null;
                } else {
                    mUSValueArr2[i] = ((WeexValueImpl) weexValue).convertMUSValue();
                }
            }
            mUSValueArr = mUSValueArr2;
        }
        callUINodeMethod(weexInstanceImpl.getAdapterMUSInstance(), uINode, MUSValue.ofString(str), mUSValueArr);
    }

    private static UINode createDefaultNode(MUSDKInstance mUSDKInstance, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("3febea1c", new Object[]{mUSDKInstance, new Integer(i), mUSValue, mUSProps, mUSProps2});
        }
        cvu b2 = ivu.b("div");
        if (b2 != null) {
            mUSDKInstance.setJustCreateTagName("div");
            return (UINode) b2.d(mUSDKInstance, i, mUSProps, mUSProps2);
        }
        ivu.h("div", new Div.a());
        throw new IllegalStateException("Div not registered, Engine Not Init!!!!!");
    }

    public static UINode createNode(MUSDKInstance mUSDKInstance, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("500b033", new Object[]{mUSDKInstance, new Integer(i), mUSValue, mUSProps, mUSProps2});
        }
        try {
            try {
                try {
                    String stringValue = mUSValue.getStringValue();
                    cvu b2 = ivu.b(stringValue);
                    mUSDKInstance.setJustCreateTagName(stringValue);
                    if (b2 != null) {
                        UINode uINode = (UINode) b2.d(mUSDKInstance, i, mUSProps, mUSProps2);
                        if (uINode != null) {
                            return uINode;
                        }
                        dwh.f("[createNode]", "createNode in normal Exception to return null,3: " + stringValue);
                        throw new IllegalStateException("default exception3:" + stringValue);
                    }
                    dwh.f("[Render]", "Node type of <" + mUSValue.printToString() + "> dose not exist");
                    UINode createDefaultNode = createDefaultNode(mUSDKInstance, i, mUSValue, mUSProps, mUSProps2);
                    if (createDefaultNode != null) {
                        return createDefaultNode;
                    }
                    dwh.f("[createNode]", "createNode in default Exception to return null,4: " + stringValue);
                    throw new IllegalStateException("default exception4:" + stringValue);
                } catch (Exception e) {
                    wvh.a().b("MUSUINodeBridge.createNode", e);
                    dwh.g("[Render]", "Client native error occur", e);
                    UINode createDefaultNode2 = createDefaultNode(mUSDKInstance, i, mUSValue, mUSProps, mUSProps2);
                    if (createDefaultNode2 != null) {
                        return createDefaultNode2;
                    }
                    dwh.f("[createNode]", "createNode in default Exception to return null,2");
                    throw new IllegalStateException("default exception2:");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                dwh.g("[createNode]", "createNode Exception to return null,1", th);
                return null;
            }
        } catch (OutOfMemoryError unused) {
            Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
            Runnable runnable = OOM_DETECTOR;
            executor.execute(runnable);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            synchronized (runnable) {
                runnable.wait(10000L);
                return null;
            }
        }
    }

    public static UINode createNode2(WeexInstanceImpl weexInstanceImpl, int i, MUSValue mUSValue, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("83129dab", new Object[]{weexInstanceImpl, new Integer(i), mUSValue, mUSProps, mUSProps2});
        }
        return createNode(weexInstanceImpl.getAdapterMUSInstance(), i, mUSValue, mUSProps, mUSProps2);
    }

    public static void endUpdate(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baecf14b", new Object[]{mUSDKInstance});
            return;
        }
        try {
            if (!mUSDKInstance.isDestroyed() && mUSDKInstance.getRenderManager() != null) {
                u8x.a("MusRenderManagerUpdate");
                mUSDKInstance.getRenderManager().i(mUSDKInstance);
                u8x.b("MusRenderManagerUpdate");
            }
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.endUpdate", e);
            dwh.i(e);
        }
    }

    public static void endUpdate2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745d2c53", new Object[]{weexInstanceImpl});
        } else {
            endUpdate(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void insertNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b06419", new Object[]{mUSDKInstance, uINode, new Integer(i), uINode2});
        } else if (!mUSDKInstance.isDestroyed()) {
            uINode.addChild(i, uINode2);
        }
    }

    public static void insertNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, UINode uINode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927aa951", new Object[]{weexInstanceImpl, uINode, new Integer(i), uINode2});
        } else {
            insertNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, uINode2);
        }
    }

    public static void measureNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3120aa7", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
            return;
        }
        try {
            uINode.measure(i2, i4, nxh.j(i), nxh.j(i3), iArr);
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.measureNode", e);
            dwh.g("[Render]", "Client native error occur", e);
        }
    }

    public static void measureNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7deb9f", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            measureNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2, i3, i4, iArr);
        }
    }

    public static void moveNode(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fddb8ac", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2)});
        } else if (!mUSDKInstance.isDestroyed()) {
            uINode.moveNode(i, i2);
        }
    }

    public static void moveNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3547e4", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2)});
        } else {
            moveNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2);
        }
    }

    public static void onInit(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39032020", new Object[]{mUSDKInstance});
        } else if (mUSDKInstance != null) {
            try {
                mUSDKInstance.setRenderManager(new ywh());
            } catch (Exception e) {
                wvh.a().b("MUSUINodeBridge.onInit", e);
                dwh.i(e);
            }
        }
    }

    public static void onInit2(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f205ee8", new Object[]{weexInstanceImpl});
        } else {
            onInit(weexInstanceImpl.getAdapterMUSInstance());
        }
    }

    public static void removeNode(MUSDKInstance mUSDKInstance, UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783827a4", new Object[]{mUSDKInstance, uINode, new Integer(i)});
        } else if (!mUSDKInstance.isDestroyed()) {
            uINode.removeChildAt(i);
        }
    }

    public static void removeNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f2672c", new Object[]{weexInstanceImpl, uINode, new Integer(i)});
        } else {
            removeNode(weexInstanceImpl.getAdapterMUSInstance(), uINode, i);
        }
    }

    public static void removeNodeEvent(MUSDKInstance mUSDKInstance, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23be42da", new Object[]{mUSDKInstance, uINode, mUSValue});
        } else if (mUSValue != null) {
            try {
                if (!TextUtils.isEmpty(mUSValue.getStringValue())) {
                    mUSDKInstance.enqueueTask(new c(uINode, mUSValue));
                }
            } catch (Exception e) {
                wvh.a().b("MUSUINodeBridge.removeNodeEvent", e);
                dwh.g("[Render]", "Client native error occur", e);
            }
        }
    }

    public static void removeNodeEvent2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea448d2", new Object[]{weexInstanceImpl, uINode, mUSValue});
        } else {
            removeNodeEvent(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSValue);
        }
    }

    public static void setRootNode(MUSDKInstance mUSDKInstance, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e731f", new Object[]{mUSDKInstance, uINode});
            return;
        }
        try {
            mUSDKInstance.setRootNode(uINode);
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.setRootNode", e);
            dwh.i(e);
        }
    }

    public static void setRootNode2(WeexInstanceImpl weexInstanceImpl, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6f8a97", new Object[]{weexInstanceImpl, uINode});
        } else {
            setRootNode(weexInstanceImpl.getAdapterMUSInstance(), uINode);
        }
    }

    public static void updateNodeAttr(MUSDKInstance mUSDKInstance, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a8a1e3", new Object[]{mUSDKInstance, uINode, mUSProps});
            return;
        }
        try {
            uINode.updateAttrs(mUSProps);
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.updateNodeAttr", e);
            dwh.g("[Render]", "Client native error occur", e);
        }
    }

    public static void updateNodeAttr2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7555db", new Object[]{weexInstanceImpl, uINode, mUSProps});
        } else {
            updateNodeAttr(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSProps);
        }
    }

    public static void updateNodeLayout(MUSDKInstance mUSDKInstance, UINode uINode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f7f98e", new Object[]{mUSDKInstance, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            uINode.updateLayout(i, i2, i3, i4);
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.updateNodeLayout", e);
            dwh.g("[Render]", "Client native error occur", e);
        }
    }

    public static void updateNodeLayout2(WeexInstanceImpl weexInstanceImpl, UINode uINode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572be446", new Object[]{weexInstanceImpl, uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            updateNodeLayout(weexInstanceImpl.getAdapterMUSInstance(), uINode, i, i2, i3, i4);
        }
    }

    public static void updateNodeStyle(MUSDKInstance mUSDKInstance, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e26f86d", new Object[]{mUSDKInstance, uINode, mUSProps});
            return;
        }
        try {
            uINode.updateStyles(mUSProps);
        } catch (Exception e) {
            wvh.a().b("MUSUINodeBridge.updateNodeStyle", e);
            dwh.g("[Render]", "Client native error occur", e);
        }
    }

    public static void updateNodeStyle2(WeexInstanceImpl weexInstanceImpl, UINode uINode, MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f1dbe5", new Object[]{weexInstanceImpl, uINode, mUSProps});
        } else {
            updateNodeStyle(weexInstanceImpl.getAdapterMUSInstance(), uINode, mUSProps);
        }
    }
}
