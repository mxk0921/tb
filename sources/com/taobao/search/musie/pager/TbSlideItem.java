package com.taobao.search.musie.pager;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.div.Div;
import tb.kyc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbSlideItem extends Div implements a.b, kyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a.b callback;
    private boolean canPlay;
    private UINode videoNode;

    static {
        t2o.a(815792765);
        t2o.a(982516018);
        t2o.a(986710039);
    }

    public TbSlideItem(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(TbSlideItem tbSlideItem, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2087795361:
                super.unregisterNativeStateListener((String) objArr[0], (a.b) objArr[1]);
                return null;
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case 1780486726:
                super.registerNativeStateListener((String) objArr[0], (a.b) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/TbSlideItem");
        }
    }

    private final void notifyVideoPlayStatus(UINode uINode, String str) {
        a.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aa07d3", new Object[]{this, uINode, str});
        } else if (uINode != null && (bVar = this.callback) != null) {
            bVar.onNativeStateChange("videostatus", str);
        }
    }

    public final boolean canPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue();
        }
        return this.canPlay;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, tb.kyc
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else if (!TextUtils.equals(str, "videocallback")) {
            super.fireNativeEvent(str, str2);
        } else if (TextUtils.equals(str2, "finish")) {
            UINode parentNode = getParentNode();
            TbSlideDelegateNode tbSlideDelegateNode = parentNode instanceof TbSlideDelegateNode ? (TbSlideDelegateNode) parentNode : null;
            if (tbSlideDelegateNode != null) {
                tbSlideDelegateNode.playNextVideo(this);
            }
        }
    }

    @Override // tb.kyc
    public String getNativeState(String str, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c0b91ed", new Object[]{this, str, uINode});
        }
        if (!TextUtils.equals(str, "videostatus")) {
            return super.getNativeState(str);
        }
        if (this.canPlay) {
            return "play";
        }
        return "stop";
    }

    public final boolean hasVideoChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c423aa6", new Object[]{this})).booleanValue();
        }
        if (this.videoNode != null) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        }
    }

    @Override // tb.kyc
    public void registerNativeStateListener(String str, UINode uINode, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1148b6", new Object[]{this, str, uINode, bVar});
        } else if (TextUtils.equals(str, "videostatus")) {
            this.videoNode = uINode;
            this.callback = bVar;
        } else {
            super.registerNativeStateListener(str, bVar);
        }
    }

    public final void setCanPlay(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d90c0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.canPlay = z;
        UINode uINode = this.videoNode;
        if (z) {
            str = "play";
        } else {
            str = "stop";
        }
        notifyVideoPlayStatus(uINode, str);
    }

    @Override // tb.kyc
    public void unregisterNativeStateListener(String str, UINode uINode, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66a25bd", new Object[]{this, str, uINode, bVar});
        } else if (TextUtils.equals(str, "videostatus")) {
            this.videoNode = null;
            this.callback = null;
        } else {
            super.unregisterNativeStateListener(str, bVar);
        }
    }
}
