package com.taobao.mytaobao.pop.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.sgj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTBIconPixelInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -1456862388402117781L;
    private float centerX;
    public float centerX2rpx;
    private float centerY;
    public float centerY2rpx;
    public boolean findIcon;
    private float iconHeight;
    private float iconHeight2rpx;
    private float iconWidth;
    private float iconWidth2rpx;
    private boolean isFindIcon;
    private boolean isIconShow;
    private float x;
    private float x2rpx;
    private float y;
    private float y2rpx;

    static {
        t2o.a(745538010);
    }

    public float getCenterX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cfc8064", new Object[]{this})).floatValue();
        }
        return this.centerX;
    }

    public float getCenterX2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d64db26c", new Object[]{this})).floatValue();
        }
        return this.centerX2rpx;
    }

    public float getCenterY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d0a97e5", new Object[]{this})).floatValue();
        }
        return this.centerY;
    }

    public float getCenterY2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a92216d", new Object[]{this})).floatValue();
        }
        return this.centerY2rpx;
    }

    public float getIconHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef1b8c6d", new Object[]{this})).floatValue();
        }
        return this.iconHeight;
    }

    public float getIconHeight2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8591f5", new Object[]{this})).floatValue();
        }
        return this.iconHeight2rpx;
    }

    public float getIconWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d5f70e", new Object[]{this})).floatValue();
        }
        return this.iconWidth;
    }

    public float getIconWidth2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92d7c416", new Object[]{this})).floatValue();
        }
        return this.iconWidth2rpx;
    }

    public float getX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue();
        }
        return this.x;
    }

    public float getX2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1dd1eec1", new Object[]{this})).floatValue();
        }
        return this.x2rpx;
    }

    public float getY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue();
        }
        return this.y;
    }

    public float getY2rpx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2165dc2", new Object[]{this})).floatValue();
        }
        return this.y2rpx;
    }

    public boolean isFindIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4a5fa7", new Object[]{this})).booleanValue();
        }
        return this.isFindIcon;
    }

    public boolean isIconShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fc2a2eb", new Object[]{this})).booleanValue();
        }
        return this.isIconShow;
    }

    public void setCenterX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dcf0d8", new Object[]{this, new Float(f)});
            return;
        }
        this.centerX = f;
        this.centerX2rpx = sgj.g(f);
    }

    public void setCenterY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a91c977", new Object[]{this, new Float(f)});
            return;
        }
        this.centerY = f;
        this.centerY2rpx = sgj.g(f);
    }

    public void setFindIcon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f91359", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isFindIcon = z;
        this.findIcon = z;
    }

    public void setIconHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2d0457", new Object[]{this, new Float(f)});
            return;
        }
        this.iconHeight = f;
        this.iconHeight2rpx = sgj.g(f);
    }

    public void setIconShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7893895", new Object[]{this, new Boolean(z)});
        } else {
            this.isIconShow = z;
        }
    }

    public void setIconWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdfbc6e", new Object[]{this, new Float(f)});
            return;
        }
        this.iconWidth = f;
        this.iconWidth2rpx = sgj.g(f);
    }

    public void setX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ad55a3", new Object[]{this, new Float(f)});
            return;
        }
        this.x = f;
        this.x2rpx = sgj.g(f);
    }

    public void setY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29622e42", new Object[]{this, new Float(f)});
            return;
        }
        this.y = f;
        this.y2rpx = sgj.g(f);
    }
}
