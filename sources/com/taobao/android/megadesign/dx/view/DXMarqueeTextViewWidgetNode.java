package com.taobao.android.megadesign.dx.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import tb.gi6;
import tb.mxv;
import tb.qub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DXMarqueeTextViewWidgetNode extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXORDERMARQUEETEXTVIEW_LINEBREAKMODE = 1650157837879951391L;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_CHAR = 4;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_END = 3;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_MARQUEE = 5;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_MIDDLE = 2;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_NONE = 0;
    public static final int DXORDERMARQUEETEXTVIEW_LINEBREAKMODE_START = 1;
    public static final long DXORDERMARQUEETEXTVIEW_MARQUEEREPEATLIMIT = -8692246520826186654L;
    public static final long DXORDERMARQUEETEXTVIEW_ORDERMARQUEETEXTVIEW = 1035886100722271008L;

    /* renamed from: a  reason: collision with root package name */
    public int f8922a = 0;
    public int b = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMarqueeTextViewWidgetNode();
        }
    }

    public static /* synthetic */ Object ipc$super(DXMarqueeTextViewWidgetNode dXMarqueeTextViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 168865392:
                super.setLineBreakMode(((Number) objArr[0]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1417262650:
                super.setNativeMaxLines((TextView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1783221114:
                super.setNativeEllipsize((TextView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/dx/view/DXMarqueeTextViewWidgetNode");
        }
    }

    public static /* synthetic */ int t(DXMarqueeTextViewWidgetNode dXMarqueeTextViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b477fe52", new Object[]{dXMarqueeTextViewWidgetNode})).intValue();
        }
        return dXMarqueeTextViewWidgetNode.f8922a;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMarqueeTextViewWidgetNode();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 1650157837879951391L) {
            return 0;
        }
        if (j == DXORDERMARQUEETEXTVIEW_MARQUEEREPEATLIMIT) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMarqueeTextViewWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXMarqueeTextViewWidgetNode dXMarqueeTextViewWidgetNode = (DXMarqueeTextViewWidgetNode) dXWidgetNode;
            this.f8922a = dXMarqueeTextViewWidgetNode.f8922a;
            this.b = dXMarqueeTextViewWidgetNode.b;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("ctxName", context.getClass().getName());
        mxv.INSTANCE.b("MarqueeTextViewWidgetNode", hashMap);
        return new DXNativeTextView(context) { // from class: com.taobao.android.megadesign.dx.view.DXMarqueeTextViewWidgetNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public boolean isFocused = false;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r11, String str, Object... objArr) {
                switch (str.hashCode()) {
                    case -2012646654:
                        super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                        return null;
                    case -244855388:
                        super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                        return null;
                    case 678958088:
                        super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                        return null;
                    case 949399698:
                        super.onDetachedFromWindow();
                        return null;
                    case 1626033557:
                        super.onAttachedToWindow();
                        return null;
                    default:
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/dx/view/DXMarqueeTextViewWidgetNode$1");
                }
            }

            @Override // android.widget.TextView, android.view.View
            public void onAttachedToWindow() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60eb4d95", new Object[]{this});
                    return;
                }
                super.onAttachedToWindow();
                this.isFocused = true;
            }

            @Override // android.view.View
            public void onDetachedFromWindow() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3896b092", new Object[]{this});
                    return;
                }
                super.onDetachedFromWindow();
                this.isFocused = false;
            }

            @Override // android.widget.TextView, android.view.View
            public void onFocusChanged(boolean z, int i, Rect rect) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
                } else if (DXMarqueeTextViewWidgetNode.t(DXMarqueeTextViewWidgetNode.this) == 5) {
                    super.onFocusChanged(this.isFocused, i, rect);
                } else {
                    super.onFocusChanged(z, i, rect);
                }
            }

            @Override // android.widget.TextView, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                super.onLayout(z, i, i2, i3, i4);
                if (DXMarqueeTextViewWidgetNode.t(DXMarqueeTextViewWidgetNode.this) == 5) {
                    setSelected(true);
                }
            }

            @Override // android.widget.TextView, android.view.View
            public void onWindowFocusChanged(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
                } else if (DXMarqueeTextViewWidgetNode.t(DXMarqueeTextViewWidgetNode.this) == 5) {
                    super.onWindowFocusChanged(this.isFocused);
                } else {
                    super.onWindowFocusChanged(z);
                }
            }
        };
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1650157837879951391L) {
            this.f8922a = i;
            super.setLineBreakMode(i);
        } else if (j == DXORDERMARQUEETEXTVIEW_MARQUEEREPEATLIMIT) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // tb.gi6
    public void setNativeEllipsize(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49cb7a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 5) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
            textView.setMarqueeRepeatLimit(this.b);
        } else {
            super.setNativeEllipsize(textView, i);
        }
    }

    @Override // tb.gi6
    public void setNativeMaxLines(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5479b63a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 1) {
            textView.setSingleLine();
        } else {
            super.setNativeMaxLines(textView, i);
        }
    }
}
