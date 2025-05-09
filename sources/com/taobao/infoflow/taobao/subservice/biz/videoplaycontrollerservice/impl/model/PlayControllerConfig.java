package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.strategy.protocol.PlayControlStrategy;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PlayControllerConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean playControlEnable = true;
    private String playControlFocusAreaType = PlayControlStrategy.PLAY_CONTROL_FOCUS_AREA_CENTER;
    private float playControlFocusAreaMinPercent = 0.2f;

    static {
        t2o.a(491782766);
    }

    public PlayControllerConfig deepCopy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayControllerConfig) ipChange.ipc$dispatch("cf193286", new Object[]{this});
        }
        PlayControllerConfig playControllerConfig = new PlayControllerConfig();
        playControllerConfig.setPlayControlEnable(this.playControlEnable);
        playControllerConfig.setPlayControlFocusAreaType(this.playControlFocusAreaType);
        playControllerConfig.setPlayControlFocusAreaMinPercent(this.playControlFocusAreaMinPercent);
        return playControllerConfig;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayControllerConfig playControllerConfig = (PlayControllerConfig) obj;
        if (this.playControlEnable != playControllerConfig.playControlEnable || !ObjectUtils.b(this.playControlFocusAreaType, playControllerConfig.playControlFocusAreaType) || !ObjectUtils.b(Float.valueOf(this.playControlFocusAreaMinPercent), Float.valueOf(playControllerConfig.playControlFocusAreaMinPercent))) {
            return false;
        }
        return true;
    }

    public float getPlayControlFocusAreaMinPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("750d199c", new Object[]{this})).floatValue();
        }
        return this.playControlFocusAreaMinPercent;
    }

    public String getPlayControlFocusAreaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bab5a7ad", new Object[]{this});
        }
        return this.playControlFocusAreaType;
    }

    public boolean isPlayControlEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7eef25ed", new Object[]{this})).booleanValue();
        }
        return this.playControlEnable;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.playControlFocusAreaType);
    }

    public void setPlayControlEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad43f43", new Object[]{this, new Boolean(z)});
        } else {
            this.playControlEnable = z;
        }
    }

    public void setPlayControlFocusAreaMinPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc75db08", new Object[]{this, new Float(f)});
        } else {
            this.playControlFocusAreaMinPercent = f;
        }
    }

    public void setPlayControlFocusAreaType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b331069", new Object[]{this, str});
        } else {
            this.playControlFocusAreaType = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PlayControllerConfig{playControlEnable=" + this.playControlEnable + ", playControlFocusAreaType='" + this.playControlFocusAreaType + "', playControlFocusAreaMinPercent=" + this.playControlFocusAreaMinPercent + '}';
    }
}
