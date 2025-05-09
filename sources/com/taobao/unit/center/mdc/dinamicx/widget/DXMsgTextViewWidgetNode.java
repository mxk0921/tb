package com.taobao.unit.center.mdc.dinamicx.widget;

import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.util.PatternsUtil;
import com.taobao.message.kit.util.Span;
import com.taobao.message.uikit.linkify.MessageSpanClickHandler;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.message.uikit.text.style.LongClickLinkMovementMethod;
import com.taobao.message.uikit.text.style.LongClickableSpan;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.gi6;
import tb.h1p;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXMsgTextViewWidgetNode extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMSGTEXTVIEW_ACTIVECONTENT = 2771477718722326628L;
    private static final String TAG = "DXMsgTextViewWidgetNode";
    private JSONArray activeContent;
    private Map<String, WeakReference<SpannableString>> spans = new HashMap(1);
    private String text;
    public static final Long DXWIDGET_MsgTextView = -7857664725499683470L;
    private static Pattern sNumberPattern = Pattern.compile("(\\d*[-]?\\d*)");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599776);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMsgTextViewWidgetNode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public abstract class DXClickableSpan extends LongClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599777);
        }

        private DXClickableSpan() {
        }

        public static /* synthetic */ Object ipc$super(DXClickableSpan dXClickableSpan, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode$DXClickableSpan");
        }

        @Override // com.taobao.message.uikit.text.style.LongClickableSpan
        public void onDoubleClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd83113", new Object[]{this, view});
            }
        }

        @Override // com.taobao.message.uikit.text.style.LongClickableSpan
        public void onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7edba0fe", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(552599771);
    }

    private void clearPhoneNumSpan(SpannableString spannableString, int i, int i2, Set<DXClickableSpan> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02c2e07", new Object[]{this, spannableString, new Integer(i), new Integer(i2), set});
            return;
        }
        for (DXClickableSpan dXClickableSpan : set) {
            if (dXClickableSpan != null && dXClickableSpan.getStart() >= i && dXClickableSpan.getEnd() <= i2) {
                spannableString.removeSpan(dXClickableSpan);
            }
        }
    }

    private void clearUrlSpan(SpannableString spannableString, int i, int i2, Set<DXClickableSpan> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e0a2a", new Object[]{this, spannableString, new Integer(i), new Integer(i2), set});
            return;
        }
        for (DXClickableSpan dXClickableSpan : set) {
            if (dXClickableSpan != null && dXClickableSpan.getStart() >= i && dXClickableSpan.getEnd() <= i2) {
                spannableString.removeSpan(dXClickableSpan);
            }
        }
    }

    private void disposeEmail(SpannableString spannableString, Set<DXClickableSpan> set, Set<DXClickableSpan> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14219aa6", new Object[]{this, spannableString, set, set2});
            return;
        }
        Matcher matcher = PatternsUtil.getEmailPattern().matcher(spannableString.toString());
        while (matcher.find()) {
            final String group = matcher.group();
            if (!TextUtils.isEmpty(group)) {
                DXClickableSpan dXClickableSpan = new DXClickableSpan() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode$3");
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            MessageSpanClickHandler.showMessageContextMenu(view.getContext(), group, 2);
                        }
                    }
                };
                clearPhoneNumSpan(spannableString, matcher.start(), matcher.end(), set);
                clearUrlSpan(spannableString, matcher.start(), matcher.end(), set2);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
                spannableString.setSpan(dXClickableSpan, matcher.start(), matcher.end(), 17);
                spannableString.setSpan(foregroundColorSpan, matcher.start(), matcher.end(), 17);
            }
        }
    }

    private void disposePhoneNum(SpannableString spannableString, Set<DXClickableSpan> set, Set<DXClickableSpan> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa246c60", new Object[]{this, spannableString, set, set2});
            return;
        }
        set.clear();
        for (final Span span : findPhonesSpans(spannableString.toString())) {
            DXClickableSpan dXClickableSpan = new DXClickableSpan() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode$4");
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        MessageSpanClickHandler.showMessageContextMenu(view.getContext(), span.getStr(), 0);
                    }
                }
            };
            dXClickableSpan.setStart(span.getStart());
            dXClickableSpan.setEnd(span.getEnd());
            set.add(dXClickableSpan);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
            spannableString.setSpan(dXClickableSpan, span.getStart(), span.getEnd(), 17);
            spannableString.setSpan(foregroundColorSpan, span.getStart(), span.getEnd(), 17);
        }
    }

    private void disposeUrl(SpannableString spannableString, Set<DXClickableSpan> set, Set<DXClickableSpan> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92efd0b9", new Object[]{this, spannableString, set, set2});
            return;
        }
        Matcher matcher = PatternsUtil.getWebUrlPattern().matcher(spannableString.toString());
        while (matcher.find()) {
            final String group = matcher.group();
            if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group)) {
                DXClickableSpan dXClickableSpan = new DXClickableSpan() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode$2");
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (group.startsWith(h1p.HTTP_PREFIX) || group.startsWith(h1p.HTTPS_PREFIX)) {
                            Nav.from(DXMsgTextViewWidgetNode.this.getDXRuntimeContext().h()).toUri(group);
                        } else {
                            Nav from = Nav.from(DXMsgTextViewWidgetNode.this.getDXRuntimeContext().h());
                            from.toUri(Uri.parse(h1p.HTTP_PREFIX + group));
                        }
                    }
                };
                clearPhoneNumSpan(spannableString, matcher.start(), matcher.end(), set);
                dXClickableSpan.setStart(matcher.start());
                dXClickableSpan.setEnd(matcher.end());
                set2.add(dXClickableSpan);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#3d7fff"));
                spannableString.setSpan(dXClickableSpan, matcher.start(), matcher.end(), 17);
                spannableString.setSpan(foregroundColorSpan, matcher.start(), matcher.end(), 17);
            }
        }
    }

    public static List<Span> findPhonesSpans(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7678994b", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Matcher matcher = sNumberPattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (PatternsUtil.isPhoneNumer(group)) {
                arrayList.add(new Span(group, matcher.start(), matcher.end()));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(DXMsgTextViewWidgetNode dXMsgTextViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1302344421:
                super.setNativeText((TextView) objArr[0], (CharSequence) objArr[1]);
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode");
        }
    }

    private SpannableString parseTextString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("d6039456", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        SpannableString expressionStringWithCache = ExpressionTable.getExpressionStringWithCache(getDXRuntimeContext().h(), str);
        disposePhoneNum(expressionStringWithCache, hashSet, hashSet2);
        disposeUrl(expressionStringWithCache, hashSet, hashSet2);
        disposeEmail(expressionStringWithCache, hashSet, hashSet2);
        this.spans.put(str, new WeakReference<>(expressionStringWithCache));
        return expressionStringWithCache;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMsgTextViewWidgetNode();
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof DXMsgTextViewWidgetNode) {
            this.spans = ((DXMsgTextViewWidgetNode) dXWidgetNode).spans;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        SpannableString spannableString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXMSGTEXTVIEW_ACTIVECONTENT) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            this.activeContent = jSONArray;
            String str = this.text;
            if (str == null || !this.spans.containsKey(str)) {
                String str2 = this.text;
                if (str2 != null) {
                    spannableString = parseTextString(str2);
                } else {
                    spannableString = null;
                }
            } else {
                spannableString = this.spans.get(this.text).get();
            }
            if (spannableString != null) {
                parseHighlight(spannableString, this.activeContent);
                this.spans.put(getText().toString(), new WeakReference<>(spannableString));
                setText(spannableString);
            }
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        SpannableString spannableString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L != j) {
            super.onSetStringAttribute(j, str);
        } else if (!TextUtils.isEmpty(str)) {
            this.text = str;
            if (!this.spans.containsKey(str) || this.activeContent == null || (spannableString = this.spans.get(str).get()) == null) {
                SpannableString parseTextString = parseTextString(str);
                JSONArray jSONArray = this.activeContent;
                if (jSONArray != null) {
                    parseHighlight(parseTextString, jSONArray);
                }
                setText(parseTextString);
                return;
            }
            setText(spannableString);
        }
    }

    @Override // tb.gi6
    public void setNativeText(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25fcd1b", new Object[]{this, textView, charSequence});
            return;
        }
        super.setNativeText(textView, charSequence);
        textView.setMovementMethod(LongClickLinkMovementMethod.getInstance());
        textView.setClickable(false);
        textView.setLongClickable(false);
        textView.setFocusable(false);
    }

    private void parseHighlight(SpannableString spannableString, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b4a9b2", new Object[]{this, spannableString, jSONArray});
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            final JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.getIntValue("index") > -1) {
                int intValue = jSONObject.getIntValue("index");
                if (intValue >= spannableString.length()) {
                    TLog.loge(TAG, "start overflow; startIndex=" + intValue + " | length=" + spannableString.length());
                } else {
                    int intValue2 = jSONObject.getIntValue("index") + (jSONObject.containsKey("text") ? jSONObject.getString("text").length() : 0);
                    if (intValue2 > spannableString.length()) {
                        TLog.loge(TAG, "end overflow; endIndex=" + intValue2 + " | length=" + spannableString.length());
                        intValue2 = spannableString.length();
                    }
                    if (spannableString.subSequence(intValue, intValue2).toString().equals(jSONObject.getString("text"))) {
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(jSONObject.getString("color"))), intValue, intValue2, 17);
                        spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgTextViewWidgetNode.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                if (str.hashCode() == -1038128277) {
                                    super.updateDrawState((TextPaint) objArr[0]);
                                    return null;
                                }
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMsgTextViewWidgetNode$1");
                            }

                            @Override // android.text.style.ClickableSpan
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                String string = jSONObject.getString("url");
                                if (TextUtils.isEmpty(string)) {
                                    return;
                                }
                                if (string.startsWith(h1p.HTTP_PREFIX) || string.startsWith(h1p.HTTPS_PREFIX)) {
                                    Nav.from(DXMsgTextViewWidgetNode.this.getDXRuntimeContext().h()).toUri(string);
                                } else {
                                    Nav.from(DXMsgTextViewWidgetNode.this.getDXRuntimeContext().h()).toUri(Uri.parse(h1p.HTTP_PREFIX.concat(string)));
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint textPaint) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                                    return;
                                }
                                super.updateDrawState(textPaint);
                                try {
                                    textPaint.setColor(Color.parseColor("#ff5f00"));
                                } catch (Throwable th) {
                                    TLog.loge(DXMsgTextViewWidgetNode.TAG, Log.getStackTraceString(th));
                                }
                                textPaint.setUnderlineText(false);
                            }
                        }, intValue, intValue2, 17);
                    }
                }
            }
        }
    }
}
