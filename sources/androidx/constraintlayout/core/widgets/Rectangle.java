package androidx.constraintlayout.core.widgets;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Rectangle {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int height;
    public int width;
    public int x;
    public int y;

    public boolean contains(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a073020a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i4 = this.x;
        if (i < i4 || i >= i4 + this.width || i2 < (i3 = this.y) || i2 >= i3 + this.height) {
            return false;
        }
        return true;
    }

    public int getCenterX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cfc8067", new Object[]{this})).intValue();
        }
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d0a97e8", new Object[]{this})).intValue();
        }
        return (this.y + this.height) / 2;
    }

    public void grow(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282d0fa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.x -= i;
        this.y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80cae92d", new Object[]{this, rectangle})).booleanValue();
        }
        int i3 = this.x;
        int i4 = rectangle.x;
        if (i3 < i4 || i3 >= i4 + rectangle.width || (i = this.y) < (i2 = rectangle.y) || i >= i2 + rectangle.height) {
            return false;
        }
        return true;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }
}
