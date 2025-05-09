package com.taobao.android.tab2liveroom.liveroom.preload;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LivePreloadData implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_PRELOAD_ICON_STREAM = 2;
    public static final int STATUS_PRELOAD_NO_HIT_AB = 1;
    public static final int STATUS_PRELOAD_PARAMS_EMPTY = 3;
    public static final int STATUS_PRELOAD_SUCCESS = 0;
    @JSONField(name = yj4.PARAM_CUSTOM_PLAY_CTRL)
    public String customPlayCtrlParams;
    @JSONField(name = "id")
    public String id;
    private boolean isHitPreloadAB = false;
    private int preloadStatus;
    private int preloadType;
    @JSONField(name = "trackInfo")
    public String trackInfo;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface PreloadStatus {
    }

    static {
        t2o.a(779092154);
        t2o.a(806355930);
    }

    public void buildPreloadStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38818194", new Object[]{this});
            return;
        }
        int i = this.preloadType;
        if (i != 0) {
            if (!this.isHitPreloadAB) {
                this.preloadStatus = 1;
            } else if (i == 3) {
                this.preloadStatus = 2;
            } else if (TextUtils.isEmpty(this.customPlayCtrlParams) || TextUtils.isEmpty(this.id)) {
                this.preloadStatus = 3;
            } else {
                this.preloadStatus = 0;
            }
        }
    }

    public boolean canComposeQuickOpenParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f5f946", new Object[]{this})).booleanValue();
        }
        if (!this.isHitPreloadAB || TextUtils.isEmpty(this.customPlayCtrlParams) || TextUtils.isEmpty(this.id)) {
            return false;
        }
        return true;
    }

    public int getPreloadStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d199a59f", new Object[]{this})).intValue();
        }
        return this.preloadStatus;
    }

    public boolean isHitPreloadAB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c97ec", new Object[]{this})).booleanValue();
        }
        return this.isHitPreloadAB;
    }

    public void setHitPreloadAB(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b2bfb4", new Object[]{this, new Boolean(z)});
        } else {
            this.isHitPreloadAB = z;
        }
    }

    public void setPreloadType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c12ccdb", new Object[]{this, new Integer(i)});
        } else {
            this.preloadType = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LivePreloadData{id='" + this.id + "', customPlayCtrlParams='" + this.customPlayCtrlParams + "', trackInfo='" + this.trackInfo + "'}";
    }
}
