package com.taobao.android.dinamicx.widget.video;

import android.content.Context;
import android.view.View;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoProgressView;
import tb.qub;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXProgressBarWidgetNode extends DXWidgetNode implements SeekBar.OnSeekBarChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIDEOPROGRESSBAR_ONTOUCHBEGIN = -7183435204365968175L;
    public static final long DXVIDEOPROGRESSBAR_ONTOUCHEND = 5413226078198476289L;
    public static final long DXVIDEOPROGRESSBAR_ONVALUECHANGED = 2427712879054643858L;
    public static final long DXVIDEOPROGRESSBAR_SHOWTEXT = 6459922364893334382L;
    public static final long DXVIDEOPROGRESSBAR_TOUCHMAXY = -6837759331465248341L;
    public static final long DXVIDEOPROGRESSBAR_VALUE = 19904500975458L;
    public static final long DXVIDEOPROGRESSBAR_VIDEOPROGRESSBAR = -9171057097734783631L;
    private int touchMaxY;
    private double value = vu3.b.GEO_NOT_SUPPORT;
    private boolean showText = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXProgressBarWidgetNode();
        }
    }

    public static /* synthetic */ Object ipc$super(DXProgressBarWidgetNode dXProgressBarWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/video/DXProgressBarWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXProgressBarWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DXVIDEOPROGRESSBAR_VALUE) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXProgressBarWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXProgressBarWidgetNode dXProgressBarWidgetNode = (DXProgressBarWidgetNode) dXWidgetNode;
            this.touchMaxY = dXProgressBarWidgetNode.touchMaxY;
            this.value = dXProgressBarWidgetNode.value;
            this.showText = dXProgressBarWidgetNode.showText;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXVideoProgressView(context);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
        } else {
            postEvent(new DXEvent(DXVIDEOPROGRESSBAR_ONVALUECHANGED));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof DXVideoProgressView) {
            DXVideoProgressView dXVideoProgressView = (DXVideoProgressView) view;
            dXVideoProgressView.setTouchMaxY(this.touchMaxY);
            dXVideoProgressView.setHintTextVisible(this.showText);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXVIDEOPROGRESSBAR_VALUE) {
            this.value = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXVIDEOPROGRESSBAR_TOUCHMAXY) {
            this.touchMaxY = i;
        } else if (j == DXVIDEOPROGRESSBAR_SHOWTEXT) {
            if (i == 0) {
                z = false;
            }
            this.showText = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
        } else {
            postEvent(new DXEvent(DXVIDEOPROGRESSBAR_ONTOUCHBEGIN));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
        } else {
            postEvent(new DXEvent(DXVIDEOPROGRESSBAR_ONTOUCHEND));
        }
    }

    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXVideoProgressView) {
            ((DXVideoProgressView) D).onVideoProgressChanged(i, i2, i3, this);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXVideoProgressView) {
            ((DXVideoProgressView) D).setProgress(0);
        }
    }

    public void setValue(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935a1fc8", new Object[]{this, new Double(d)});
        } else {
            this.value = d;
        }
    }

    public void setVideoSeekToCallback(DXVideoProgressView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b57a6b", new Object[]{this, bVar});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXVideoProgressView) {
            DXVideoProgressView dXVideoProgressView = (DXVideoProgressView) D;
            dXVideoProgressView.setVideoSeekToCallback(bVar);
            dXVideoProgressView.setOnSeekBarChangeListener(this);
        }
    }
}
