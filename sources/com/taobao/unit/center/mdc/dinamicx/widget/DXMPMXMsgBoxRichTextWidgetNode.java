package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.gi6;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXMPMXMsgBoxRichTextWidgetNode extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMPMXMSGBOXRICHTEXT_COLORRULES = -224133431040551116L;
    public static final long DXMPMXMSGBOXRICHTEXT_MPMXMSGBOXRICHTEXT = 1514903933273583823L;
    public static final long DXMPMXMSGBOXRICHTEXT_SYSTEMTEXTSIZE = 3582162173992669683L;
    private static final LruCache<String, Boolean> sCacheMap = new LruCache<>(100);
    private JSONArray colorRules;
    private int systemTextSize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599756);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMPMXMsgBoxRichTextWidgetNode();
        }
    }

    static {
        t2o.a(552599755);
    }

    public static /* synthetic */ Object ipc$super(DXMPMXMsgBoxRichTextWidgetNode dXMPMXMsgBoxRichTextWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMPMXMsgBoxRichTextWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMPMXMsgBoxRichTextWidgetNode();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMPMXMsgBoxRichTextWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXMPMXMsgBoxRichTextWidgetNode dXMPMXMsgBoxRichTextWidgetNode = (DXMPMXMsgBoxRichTextWidgetNode) dXWidgetNode;
            this.colorRules = dXMPMXMsgBoxRichTextWidgetNode.colorRules;
            this.systemTextSize = dXMPMXMsgBoxRichTextWidgetNode.systemTextSize;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null && (view instanceof TextView)) {
            TextView textView = (TextView) view;
            if (getText() == null) {
                str = null;
            } else {
                str = getText().toString();
            }
            if (str != null) {
                LruCache<String, Boolean> lruCache = sCacheMap;
                Boolean bool = lruCache.get(str);
                if (bool == null || bool.booleanValue()) {
                    String convertExpression = ExpressionTable.convertExpression(str);
                    if (!TextUtils.isEmpty(convertExpression)) {
                        textView.setText(convertExpression);
                    } else {
                        textView.setText("");
                    }
                    lruCache.put(str, Boolean.valueOf(!TextUtils.equals(convertExpression, str)));
                }
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 3582162173992669683L) {
            this.systemTextSize = i;
        } else if (6751005219504497256L != j) {
            super.onSetIntAttribute(j, i);
        } else if (i > 0) {
            Context h = getDXRuntimeContext().h();
            setTextSize(DisplayUtil.sp2px(h, DisplayUtil.px2dip(h, i)));
        } else {
            setTextSize(gi6.DEFAULT_TEXT_SIZE);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXMPMXMSGBOXRICHTEXT_COLORRULES) {
            this.colorRules = jSONArray;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }
}
