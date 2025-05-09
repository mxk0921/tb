package com.taobao.oversea.baobao.view;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.Map;
import tb.e0n;
import tb.lsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MSProgress extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "tmgbaobaoprogress";
    private BaobaoProgress mRootView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11422a;

        public a(Map map) {
            this.f11422a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (MSProgress.access$000(MSProgress.this) != null) {
                    MSProgress.access$000(MSProgress.this).update(this.f11422a);
                }
            } catch (Exception unused) {
            }
        }
    }

    public MSProgress(int i) {
        super(i);
    }

    public static /* synthetic */ BaobaoProgress access$000(MSProgress mSProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoProgress) ipChange.ipc$dispatch("bd82e1b7", new Object[]{mSProgress});
        }
        return mSProgress.mRootView;
    }

    public static /* synthetic */ Object ipc$super(MSProgress mSProgress, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -142946533) {
            return new Boolean(super.onUpdateAttr((String) objArr[0], (MUSValue) objArr[1]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/oversea/baobao/view/MSProgress");
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        BaobaoProgress build = BaobaoProgress.build(context);
        e0n.b().d(MSProgress.class.getName(), this.mRootView);
        try {
            build.init((Map) JSON.parse(((MUSValue) getAttribute("data")).convertToString()));
        } catch (Exception unused) {
        }
        return build;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mRootView = (BaobaoProgress) obj;
        super.onMount(mUSDKInstance, obj);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77acf1b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        try {
            if (!str.equals("data")) {
                return super.onUpdateAttr(str, mUSValue);
            }
            setAttribute(str, mUSValue);
            if (this.mRootView != null) {
                lsa.a().b(new a((Map) JSON.parse(mUSValue.convertToString())));
            }
            return true;
        } catch (Exception unused) {
            return super.onUpdateAttr(str, mUSValue);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, tb.hvu
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        this.mRootView = null;
        e0n.b().f(MSProgress.class.getName());
    }
}
