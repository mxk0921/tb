package com.taobao.tao.navigation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class IconForegroundImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHAPE_CIRCLE = 12;
    public static final int SHAPE_DEFAULT = 11;
    public boolean isClip = false;
    private final Path path = new Path();
    private final float density = getContext().getResources().getDisplayMetrics().density;

    public IconForegroundImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(IconForegroundImageView iconForegroundImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/navigation/view/IconForegroundImageView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.isClip) {
            this.path.reset();
            this.path.addCircle(getPivotX(), getPivotY(), this.density * 18.0f, Path.Direction.CW);
            canvas.clipPath(this.path);
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            setImageDrawable(drawable, 12);
        }
    }

    public void setImageDrawable(Drawable drawable, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29e6041", new Object[]{this, drawable, new Integer(i)});
            return;
        }
        if (i != 12) {
            z = false;
        }
        this.isClip = z;
        super.setImageDrawable(drawable);
    }
}
