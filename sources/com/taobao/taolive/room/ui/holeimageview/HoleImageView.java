package com.taobao.taolive.room.ui.holeimageview;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HoleImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wya background;

    static {
        t2o.a(806355806);
    }

    public HoleImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(HoleImageView holeImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == -974402955) {
            super.setImageResource(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/ui/holeimageview/HoleImageView");
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void resetBackgroundHoleArea(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f85031", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        wya wyaVar = new wya(getBackground());
        this.background = wyaVar;
        setBackground(wyaVar);
        Path path = new Path();
        path.addRect(i, i2, i3, i4, Path.Direction.CW);
        this.background.a(path);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            super.setImageDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
        } else {
            super.setImageResource(i);
        }
    }

    public HoleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HoleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
