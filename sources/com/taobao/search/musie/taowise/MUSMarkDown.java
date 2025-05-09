package com.taobao.search.musie.taowise;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import tb.ckf;
import tb.qwc;
import tb.sqc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSMarkDown extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private sqc markdownView;

    static {
        t2o.a(815792786);
    }

    public MUSMarkDown(int i) {
        super(i);
        Object obj;
        qwc a2 = qwc.MuiseViewFactory.a();
        sqc sqcVar = null;
        if (a2 != null) {
            obj = a2.a("markdown");
        } else {
            obj = null;
        }
        this.markdownView = obj instanceof sqc ? (sqc) obj : sqcVar;
    }

    public static /* synthetic */ Object ipc$super(MUSMarkDown mUSMarkDown, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 545542899) {
            return new Boolean(super.onUpdateStyle((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
        }
        if (hashCode == 908957670) {
            super.onBindInstance((UINode) objArr[0], (MUSDKInstance) objArr[1]);
            return null;
        } else if (hashCode == 2146603619) {
            return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/taowise/MUSMarkDown");
        }
    }

    public final sqc getMarkdownView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sqc) ipChange.ipc$dispatch("7506894a", new Object[]{this});
        }
        return this.markdownView;
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
            return;
        }
        super.onBindInstance(uINode, mUSDKInstance);
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.e(this);
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar == null) {
            return new View(context);
        }
        ckf.d(context);
        return sqcVar.c(context);
    }

    @Override // tb.hvu
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.a(i, i2, i3, i4, iArr);
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.i(mUSDKInstance, obj);
        }
        if (this.markdownView == null) {
            fireEvent("failed", new JSONObject());
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.d(uINode, obj, str, obj2);
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.b(mUSDKInstance, obj);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            return sqcVar.f(uINode, str, mUSValue);
        }
        return super.onUpdateAttr(uINode, str, mUSValue);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.h(uINode, obj, str, obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            sqcVar.g(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        sqc sqcVar = this.markdownView;
        if (sqcVar != null) {
            return sqcVar.j(uINode, str, mUSValue);
        }
        return super.onUpdateStyle(uINode, str, mUSValue);
    }

    public final void setMarkdownView(sqc sqcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374b9c4c", new Object[]{this, sqcVar});
        } else {
            this.markdownView = sqcVar;
        }
    }
}
