package com.taobao.search.musie.videoscroll;

import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.dwh;
import tb.hxh;
import tb.kyc;
import tb.t2o;
import tb.xuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class VideoScrollNode extends ScrollerRootNode implements kyc, a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Comparator<UINode> LEFT_COMPARATOR = new a();
    public static final String TAG = "mus-video-scroll";
    public UINode lastPlayingVideo;
    public MUSVideoScroll parentNode;
    public String videoStatus;
    public List<UINode> observingChildren = new ArrayList(5);
    public final Map<String, Map<UINode, a.b>> nativeStateObservers = new HashMap();
    public Set<String> registeredEvents = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Comparator<UINode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UINode uINode, UINode uINode2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff3cdf", new Object[]{this, uINode, uINode2})).intValue();
            }
            int i = uINode.getGlobalVisibleRect().left;
            int i2 = uINode2.getGlobalVisibleRect().left;
            if (i == i2) {
                return 0;
            }
            return i - i2;
        }
    }

    static {
        t2o.a(815792799);
        t2o.a(986710039);
        t2o.a(982516018);
    }

    public VideoScrollNode(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(VideoScrollNode videoScrollNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2087795361:
                super.unregisterNativeStateListener((String) objArr[0], (a.b) objArr[1]);
                return null;
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -1476055420:
                super.updateLayoutState((xuu) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 213310163:
                super.setParentNode((UINode) objArr[0]);
                return null;
            case 1780486726:
                super.registerNativeStateListener((String) objArr[0], (a.b) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/videoscroll/VideoScrollNode");
        }
    }

    private void onVideoStatusChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657d0bf7", new Object[]{this, str});
            return;
        }
        if (dwh.r()) {
            dwh.a(str == null ? "" : str);
        }
        if (TextUtils.equals(str, "play")) {
            onHorizontalScroll(this.parentNode.getLastScrollX());
            return;
        }
        UINode uINode = this.lastPlayingVideo;
        this.lastPlayingVideo = null;
        notifyVideoPlayStatus(uINode, "stop");
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, tb.kyc
    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "videocallback")) {
            onVideoStateChange(str2);
        } else {
            super.fireNativeEvent(str, str2);
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
        if (this.videoStatus == null) {
            String nativeState = super.getNativeState(str);
            this.videoStatus = nativeState;
            onVideoStatusChanged(nativeState);
        }
        if (this.lastPlayingVideo == null && isTotalVisible(this.parentNode.getLastScrollX(), getNodeInfo().N(), uINode.getGlobalVisibleRect())) {
            if (TextUtils.equals(this.videoStatus, "play")) {
                this.lastPlayingVideo = uINode;
            }
            return this.videoStatus;
        } else if (uINode == this.lastPlayingVideo) {
            return this.videoStatus;
        } else {
            return "stop";
        }
    }

    public boolean isTotalVisible(int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdf71bbe", new Object[]{this, new Integer(i), new Integer(i2), rect})).booleanValue();
        }
        if (rect.left < i || rect.right > i + i2) {
            return false;
        }
        return true;
    }

    public void notifyVideoPlayStatus(UINode uINode, String str) {
        Map<UINode, a.b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aa07d3", new Object[]{this, uINode, str});
        } else if (uINode != null && (map = this.nativeStateObservers.get("videostatus")) != null) {
            a.b bVar = map.get(uINode);
            if (bVar != null) {
                bVar.onNativeStateChange("videostatus", str);
            }
            if (dwh.r()) {
                dwh.b(TAG, "change child index " + indexOf(uINode) + " - " + str);
            }
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        this.lastPlayingVideo = null;
        for (String str : this.nativeStateObservers.keySet()) {
            if (!this.registeredEvents.contains(str)) {
                this.registeredEvents.add(str);
                super.registerNativeStateListener(str, this);
            }
        }
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "videostatus")) {
            this.videoStatus = str2;
            onVideoStatusChanged(str2);
        } else {
            Map<UINode, a.b> map = this.nativeStateObservers.get(str);
            if (!(map == null || map.isEmpty())) {
                for (a.b bVar : map.values()) {
                    bVar.onNativeStateChange(str, str2);
                }
            }
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        for (String str : this.registeredEvents) {
            super.unregisterNativeStateListener(str, this);
        }
        this.registeredEvents.clear();
        this.nativeStateObservers.clear();
        this.observingChildren.clear();
        this.videoStatus = null;
        this.lastPlayingVideo = null;
    }

    @Override // tb.kyc
    public void registerNativeStateListener(String str, UINode uINode, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1148b6", new Object[]{this, str, uINode, bVar});
        } else if (hxh.a()) {
            Map<UINode, a.b> map = this.nativeStateObservers.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.nativeStateObservers.put(str, map);
            }
            map.put(uINode, bVar);
            if (!this.registeredEvents.contains(str)) {
                super.registerNativeStateListener(str, this);
                this.registeredEvents.add(str);
            }
            if (TextUtils.equals(str, "videostatus")) {
                this.observingChildren.add(uINode);
                Collections.sort(this.observingChildren, LEFT_COMPARATOR);
            }
        } else {
            throw new RuntimeException("please register native state listener in main thread");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void setParentNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6dad3", new Object[]{this, uINode});
            return;
        }
        super.setParentNode(uINode);
        this.parentNode = (MUSVideoScroll) uINode;
    }

    @Override // tb.kyc
    public void unregisterNativeStateListener(String str, UINode uINode, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66a25bd", new Object[]{this, str, uINode, bVar});
        } else if (hxh.a()) {
            Map<UINode, a.b> map = this.nativeStateObservers.get(str);
            if (map != null && !map.isEmpty()) {
                map.remove(uINode);
                if (TextUtils.equals(str, "videostatus")) {
                    this.observingChildren.remove(uINode);
                    if (uINode == this.lastPlayingVideo) {
                        this.lastPlayingVideo = null;
                    }
                }
            }
        } else {
            throw new RuntimeException("please unregister native state listener in main thread");
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode, com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8052e84", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(xuuVar, i, i2);
        onHorizontalScroll(this.parentNode.getLastScrollX());
    }

    public void onHorizontalScroll(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71fa14c", new Object[]{this, new Integer(i)});
            return;
        }
        int N = getNodeInfo().N();
        UINode uINode = this.lastPlayingVideo;
        if (uINode == null || !isTotalVisible(i, N, uINode.getGlobalVisibleRect())) {
            UINode uINode2 = this.lastPlayingVideo;
            if (uINode2 != null) {
                this.lastPlayingVideo = null;
                notifyVideoPlayStatus(uINode2, "stop");
            }
            int size = this.observingChildren.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                UINode uINode3 = this.observingChildren.get(i2);
                if (uINode3.isMounted() && isTotalVisible(i, N, uINode3.getGlobalVisibleRect())) {
                    this.lastPlayingVideo = uINode3;
                    break;
                }
                i2++;
            }
            notifyVideoPlayStatus(this.lastPlayingVideo, "play");
        }
    }

    public void onVideoStateChange(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd87f0f6", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "finish")) {
            UINode uINode = this.lastPlayingVideo;
            this.lastPlayingVideo = null;
            int N = getNodeInfo().N();
            int size = this.observingChildren.size();
            boolean z = false;
            while (true) {
                if (i >= size) {
                    break;
                }
                UINode uINode2 = this.observingChildren.get(i);
                if (!z) {
                    if (uINode2 == uINode) {
                        z = true;
                    }
                    i++;
                } else if (isTotalVisible(this.parentNode.getLastScrollX(), N, uINode2.getGlobalVisibleRect())) {
                    this.lastPlayingVideo = uINode2;
                }
            }
        }
        notifyVideoPlayStatus(this.lastPlayingVideo, "play");
    }
}
