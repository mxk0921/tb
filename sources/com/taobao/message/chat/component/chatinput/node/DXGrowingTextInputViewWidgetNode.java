package com.taobao.message.chat.component.chatinput.node;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.graphics.drawable.IconCompat;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper;
import com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.ckf;
import tb.fl6;
import tb.jn7;
import tb.kl6;
import tb.q26;
import tb.qub;
import tb.sj8;
import tb.t2o;
import tb.tkt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0003yxzB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u001dJ\u0019\u0010%\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\u0006\u00100\u001a\u00020+H\u0014¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020+H\u0014¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00010\u00132\u0006\u00108\u001a\u000207H\u0014¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0015¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0017¢\u0006\u0004\bE\u0010\u0004J\u000f\u0010F\u001a\u00020\tH\u0017¢\u0006\u0004\bF\u0010\u0004J\u000f\u0010G\u001a\u00020\tH\u0017¢\u0006\u0004\bG\u0010\u0004J\u0017\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0007H\u0017¢\u0006\u0004\bL\u0010MJ!\u0010O\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010N\u001a\u00020\u0015H\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010O\u001a\u00020\t2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bO\u0010KJ\u0011\u0010Q\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\tH\u0017¢\u0006\u0004\bV\u0010\u0004J\u000f\u0010W\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010\u0004J'\u0010Z\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\\\u0010MR\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010aR\u0016\u0010e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010^R\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010^R\u0016\u0010i\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010^R\u0018\u0010j\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010cR\u0016\u0010k\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010^R\u0016\u0010l\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010^R\u0016\u0010m\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010nR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010vR\u0016\u0010w\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010v¨\u0006{"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Lcom/taobao/message/chat/component/chatinput/node/IGrowingTextInput;", "<init>", "()V", "Landroid/widget/EditText;", "editText", "", "textGravity", "Ltb/xhv;", "setNativeTextGravity", "(Landroid/widget/EditText;I)V", "Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;", "ed", "considerInitKeyboardHelper", "(Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;)V", "textInputWidgetNode", "Landroid/text/Editable;", "buff", "Landroid/view/View;", "view", "", "onDeleteChar", "(Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;Landroid/text/Editable;Landroid/view/View;)Z", "Lcom/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent;", "event", "postMyEvent", "(Lcom/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent;)V", "createNativeView", "()Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;", "setupNativeView", "(Landroid/widget/EditText;)V", "measureUtilView", "onBeforeMeasure", "getEditText", "", IconCompat.EXTRA_OBJ, CartRecommendRefreshScene.build, "(Ljava/lang/Object;)Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "widgetNode", "deepClone", "onClone", "(Lcom/taobao/android/dinamicx/widget/DXWidgetNode;Z)V", "", "key", "getDefaultValueForIntAttr", "(J)I", "", "attr", "onSetStringAttribute", "(JLjava/lang/String;)V", "onSetIntAttribute", "(JI)V", "onSetLongAttribute", "(JJ)V", "Landroid/content/Context;", "context", "weakView", "eventId", "onBindEvent", "(Landroid/content/Context;Landroid/view/View;J)V", "onCreateView", "(Landroid/content/Context;)Landroid/view/View;", "onRenderView", "(Landroid/content/Context;Landroid/view/View;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "showSoftInput", "hideSoftInput", "performDeleteClick", "", "charSequence", "insert", "(Ljava/lang/CharSequence;)V", "getLineHeight", "()I", "isInitTxt", "setText", "(Ljava/lang/CharSequence;Z)V", "getText", "()Ljava/lang/CharSequence;", "index", "setSelection", "(I)V", "requestFocus", "postRequestFocus", "start", "end", "replace", "(IILjava/lang/CharSequence;)V", "getSelection", "maxNumberOfLines", TLogTracker.LEVEL_INFO, "minNumberOfLines", "mLastSetText", "Ljava/lang/CharSequence;", "initTxt", "Ljava/lang/String;", "text", "textColor", "", "textSize", UTConstant.Args.UT_SUCCESS_F, Constants.Name.MAX_LENGTH, Constants.Name.PLACE_HOLDER, "enabledSpan", "placeHolderColor", "forceRefreshSign", "J", "Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper;", "keyboardHelper", "Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper;", "Ltb/q26;", "beforeMeasureAttribute", "Ltb/q26;", "lastRequestShowKeyboardMillis", "Z", "hasFilterFirstHideEvent", "Companion", "Builder", "InputTextWatcher", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DXGrowingTextInputViewWidgetNode extends DXWidgetNode implements IGrowingTextInput {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE = 0;
    private static final long DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN = -1938128865720576641L;
    public static final long DXGROWINGTEXTINPUTVIEW_GROWINGTEXTINPUTVIEW = -3041950315049099967L;
    private static final long DXGROWINGTEXTINPUTVIEW_INITIALTXT = 605139949298574644L;
    private static final long DXGROWINGTEXTINPUTVIEW_MAXLENGTH = -2628107586387168847L;
    private static final long DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES = 3896760638986517615L;
    private static final long DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES = -8335966836964332947L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONCHANGE = 5288679823228297259L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONFOCUSCHANGE = 145138991613514032L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONKEYBOARDHIDEEVENT = -403229045508524899L;
    private static final long DXGROWINGTEXTINPUTVIEW_ONKEYBOARDSHOWEVENT = 3900591102591836612L;
    private static final long DXGROWINGTEXTINPUTVIEW_PLACEHOLDER = 5980555813819279758L;
    private static final long DXGROWINGTEXTINPUTVIEW_PLACEHOLDERCOLOR = 1205272363096125842L;
    private static final long DXGROWINGTEXTINPUTVIEW_SPANCHANGE = -1677729577040704766L;
    private static final long DXGROWINGTEXTINPUTVIEW_SPANENABLED = -490470723614220184L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXT = 38178040921L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTCOLOR = 5737767606580872653L;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY = -1564827143683948874L;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_CENTER = 1;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_LEFT = 0;
    private static final int DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_RIGHT = 2;
    private static final long DXGROWINGTEXTINPUTVIEW_TEXTSIZE = 6751005219504497256L;
    private static final String TAG = "DXGrowingTextInputViewWidgetNode";
    private static volatile MeasurableEditText cacheEditText;
    private static volatile boolean cacheEditTextFinish;
    private int enabledSpan;
    private long forceRefreshSign;
    private boolean hasFilterFirstHideEvent;
    private String initTxt;
    private boolean isInitTxt;
    private ChatKeyboardHelper keyboardHelper;
    private long lastRequestShowKeyboardMillis;
    private CharSequence mLastSetText;
    private int maxLength;
    private int maxNumberOfLines;
    private int minNumberOfLines;
    private String placeHolder;
    private CharSequence text;
    private int textGravity;
    private float textSize;
    private int textColor = -16777216;
    private int placeHolderColor = tkt.DEFAULT_SHADOW_COLOR;
    private final q26 beforeMeasureAttribute = new q26();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$Builder;", "Ltb/qub;", "<init>", "()V", "", IconCompat.EXTRA_OBJ, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", CartRecommendRefreshScene.build, "(Ljava/lang/Object;)Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599561);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXGrowingTextInputViewWidgetNode();
        }
    }

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$Companion;", "", "()V", "DEFAULT_TEXT_COLOR", "", "DEFAULT_TEXT_SIZE", "DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN", "", "DXGROWINGTEXTINPUTVIEW_GROWINGTEXTINPUTVIEW", "DXGROWINGTEXTINPUTVIEW_INITIALTXT", "DXGROWINGTEXTINPUTVIEW_MAXLENGTH", "DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES", "DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES", "DXGROWINGTEXTINPUTVIEW_ONCHANGE", "DXGROWINGTEXTINPUTVIEW_ONFOCUSCHANGE", "DXGROWINGTEXTINPUTVIEW_ONKEYBOARDHIDEEVENT", "DXGROWINGTEXTINPUTVIEW_ONKEYBOARDSHOWEVENT", "DXGROWINGTEXTINPUTVIEW_PLACEHOLDER", "DXGROWINGTEXTINPUTVIEW_PLACEHOLDERCOLOR", "DXGROWINGTEXTINPUTVIEW_SPANCHANGE", "DXGROWINGTEXTINPUTVIEW_SPANENABLED", "DXGROWINGTEXTINPUTVIEW_TEXT", "DXGROWINGTEXTINPUTVIEW_TEXTCOLOR", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_CENTER", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_LEFT", "DXGROWINGTEXTINPUTVIEW_TEXTGRAVITY_RIGHT", "DXGROWINGTEXTINPUTVIEW_TEXTSIZE", RPCDataItems.SWITCH_TAG_LOG, "", "cacheEditText", "Lcom/taobao/message/chat/component/chatinput/view/widget/MeasurableEditText;", "cacheEditTextFinish", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(552599562);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode$InputTextWatcher;", "Landroid/text/TextWatcher;", "Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;", "textInputWidgetNode", "Landroid/view/View;", "view", "<init>", "(Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;Landroid/view/View;)V", "Landroid/text/Editable;", "s", "Ltb/xhv;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Lcom/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode;", "Landroid/view/View;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class InputTextWatcher implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final DXGrowingTextInputViewWidgetNode textInputWidgetNode;
        private final View view;

        static {
            t2o.a(552599563);
        }

        public InputTextWatcher(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, View view) {
            ckf.h(dXGrowingTextInputViewWidgetNode, "textInputWidgetNode");
            ckf.h(view, "view");
            this.textInputWidgetNode = dXGrowingTextInputViewWidgetNode;
            this.view = view;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            View view = this.view;
            if (view != null) {
                Editable text = ((EditText) view).getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
                dxCustemDataEvent.put("text", str);
                dxCustemDataEvent.put("txtChangeStart", Integer.valueOf(i));
                dxCustemDataEvent.put("txtChangeBefore", Integer.valueOf(i2));
                dxCustemDataEvent.put("txtChangeCount", Integer.valueOf(i3));
                dxCustemDataEvent.put("isInitTxt", Boolean.valueOf(DXGrowingTextInputViewWidgetNode.access$isInitTxt$p(this.textInputWidgetNode)));
                this.textInputWidgetNode.postEvent(dxCustemDataEvent);
                DXGrowingTextInputViewWidgetNode.access$setInitTxt$p(this.textInputWidgetNode, false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
        }
    }

    static {
        t2o.a(552599559);
        t2o.a(552599572);
    }

    public DXGrowingTextInputViewWidgetNode() {
        if (cacheEditText == null && !cacheEditTextFinish) {
            Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TraceUtil.beginSection("GrowingTextInput-Preload");
                    if (DXGrowingTextInputViewWidgetNode.access$getCacheEditText$cp() == null && DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext() != null && !DXGrowingTextInputViewWidgetNode.access$getCacheEditTextFinish$cp()) {
                        DXGrowingTextInputViewWidgetNode.access$setCacheEditText$cp(DXGrowingTextInputViewWidgetNode.access$createNativeView(DXGrowingTextInputViewWidgetNode.this));
                    }
                    DXGrowingTextInputViewWidgetNode.access$setCacheEditTextFinish$cp(true);
                    TraceUtil.endTrace();
                }
            });
        }
    }

    public static final /* synthetic */ MeasurableEditText access$createNativeView(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("8d75512e", new Object[]{dXGrowingTextInputViewWidgetNode});
        }
        return dXGrowingTextInputViewWidgetNode.createNativeView();
    }

    public static final /* synthetic */ MeasurableEditText access$getCacheEditText$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("cf13c68c", new Object[0]);
        }
        return cacheEditText;
    }

    public static final /* synthetic */ boolean access$getCacheEditTextFinish$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52aaa4e6", new Object[0])).booleanValue();
        }
        return cacheEditTextFinish;
    }

    public static final /* synthetic */ boolean access$getHasFilterFirstHideEvent$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb4573f", new Object[]{dXGrowingTextInputViewWidgetNode})).booleanValue();
        }
        return dXGrowingTextInputViewWidgetNode.hasFilterFirstHideEvent;
    }

    public static final /* synthetic */ int access$getMaxNumberOfLines$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3e356c1", new Object[]{dXGrowingTextInputViewWidgetNode})).intValue();
        }
        return dXGrowingTextInputViewWidgetNode.maxNumberOfLines;
    }

    public static final /* synthetic */ boolean access$isInitTxt$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22c8a40d", new Object[]{dXGrowingTextInputViewWidgetNode})).booleanValue();
        }
        return dXGrowingTextInputViewWidgetNode.isInitTxt;
    }

    public static final /* synthetic */ boolean access$onDeleteChar(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode2, Editable editable, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6d794a2", new Object[]{dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode2, editable, view})).booleanValue();
        }
        return dXGrowingTextInputViewWidgetNode.onDeleteChar(dXGrowingTextInputViewWidgetNode2, editable, view);
    }

    public static final /* synthetic */ void access$postMyEvent(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, DxCustemDataEvent dxCustemDataEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149ce095", new Object[]{dXGrowingTextInputViewWidgetNode, dxCustemDataEvent});
        } else {
            dXGrowingTextInputViewWidgetNode.postMyEvent(dxCustemDataEvent);
        }
    }

    public static final /* synthetic */ void access$setCacheEditText$cp(MeasurableEditText measurableEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e942574c", new Object[]{measurableEditText});
        } else {
            cacheEditText = measurableEditText;
        }
    }

    public static final /* synthetic */ void access$setCacheEditTextFinish$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2b5a6", new Object[]{new Boolean(z)});
        } else {
            cacheEditTextFinish = z;
        }
    }

    public static final /* synthetic */ void access$setHasFilterFirstHideEvent$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0df6d", new Object[]{dXGrowingTextInputViewWidgetNode, new Boolean(z)});
        } else {
            dXGrowingTextInputViewWidgetNode.hasFilterFirstHideEvent = z;
        }
    }

    public static final /* synthetic */ void access$setInitTxt$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2909fe33", new Object[]{dXGrowingTextInputViewWidgetNode, new Boolean(z)});
        } else {
            dXGrowingTextInputViewWidgetNode.isInitTxt = z;
        }
    }

    public static final /* synthetic */ void access$setMaxNumberOfLines$p(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451ab401", new Object[]{dXGrowingTextInputViewWidgetNode, new Integer(i)});
        } else {
            dXGrowingTextInputViewWidgetNode.maxNumberOfLines = i;
        }
    }

    private final void considerInitKeyboardHelper(MeasurableEditText measurableEditText) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724da50", new Object[]{this, measurableEditText});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        ckf.c(dXRuntimeContext, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
        fl6 S = dXRuntimeContext.S();
        Activity activity = null;
        if (!(S instanceof DXWidgetInstance.MPUserContext)) {
            S = null;
        }
        DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) S;
        if (mPUserContext != null) {
            Disposable disposable = mPUserContext.getDisposable(ChatKeyboardHelper.TAG);
            if (!(disposable instanceof ChatKeyboardHelper)) {
                disposable = null;
            }
            ChatKeyboardHelper chatKeyboardHelper = (ChatKeyboardHelper) disposable;
            if (chatKeyboardHelper != null) {
                this.keyboardHelper = chatKeyboardHelper;
                return;
            }
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            ckf.c(dXRuntimeContext2, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
            DXRootView L = dXRuntimeContext2.L();
            if (L != null) {
                context = L.getContext();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = context;
            }
            Activity activity2 = activity;
            if (activity2 != null) {
                ChatKeyboardHelper chatKeyboardHelper2 = new ChatKeyboardHelper(activity2, measurableEditText);
                chatKeyboardHelper2.setKeyboardWillShowOrHide(new DXGrowingTextInputViewWidgetNode$considerInitKeyboardHelper$$inlined$apply$lambda$1(chatKeyboardHelper2, this));
                this.keyboardHelper = chatKeyboardHelper2;
                mPUserContext.addDisposable(ChatKeyboardHelper.TAG, chatKeyboardHelper2);
            }
        }
    }

    private final MeasurableEditText getEditText() {
        MeasurableEditText measurableEditText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("af9f060d", new Object[]{this});
        }
        TraceUtil.beginSection("GrowingTextInput-getEditText");
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        ckf.c(dXRuntimeContext, "this.dxRuntimeContext");
        View findViewById = dXRuntimeContext.L().findViewById(R.id.mp_chat_input_id);
        if (findViewById instanceof MeasurableEditText) {
            measurableEditText = (MeasurableEditText) findViewById;
            measurableEditText.setPasteCallback(new MeasurableEditText.IPasteCallback() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$getEditText$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText.IPasteCallback
                public final void onPaste(CharSequence charSequence, CharSequence charSequence2) {
                    String str;
                    String obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dfae79c3", new Object[]{this, charSequence, charSequence2});
                        return;
                    }
                    DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
                    if (charSequence == null || (obj = charSequence.toString()) == null || (str = URLEncoder.encode(obj, "UTF-8")) == null) {
                        str = "";
                    }
                    dxCustemDataEvent.put("text", str);
                    dxCustemDataEvent.put("action", "paste");
                    if (charSequence2 == null) {
                        charSequence2 = "";
                    }
                    dxCustemDataEvent.put("label", charSequence2);
                    DXGrowingTextInputViewWidgetNode.this.postEvent(dxCustemDataEvent);
                }
            });
        } else {
            if (cacheEditText != null) {
                TraceUtil.beginSection("GrowingTextInput-cacheEditText");
                measurableEditText = cacheEditText;
                if (measurableEditText != null) {
                    cacheEditText = null;
                    TraceUtil.endTrace();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText");
                }
            } else {
                TraceUtil.beginSection("GrowingTextInput-createNativeView");
                measurableEditText = createNativeView();
                TraceUtil.endTrace();
            }
            TraceUtil.beginSection("GrowingTextInput-setupNativeView");
            setupNativeView(measurableEditText);
            TraceUtil.endTrace();
        }
        TraceUtil.endTrace();
        return measurableEditText;
    }

    public static /* synthetic */ Object ipc$super(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/chat/component/chatinput/node/DXGrowingTextInputViewWidgetNode");
        }
    }

    private final void onBeforeMeasure(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a1758", new Object[]{this, editText});
            return;
        }
        this.beforeMeasureAttribute.f26456a = getLayoutWidth();
        this.beforeMeasureAttribute.b = getLayoutHeight();
        q26 q26Var = this.beforeMeasureAttribute;
        getWeight();
        q26Var.getClass();
        int layoutGravity = getLayoutGravity();
        q26 q26Var2 = this.beforeMeasureAttribute;
        if (layoutGravity != q26Var2.d) {
            q26Var2.c = kl6.f(DXWidgetNode.getAbsoluteGravity(getLayoutGravity(), getDirection()));
            this.beforeMeasureAttribute.d = getLayoutGravity();
        }
        DXWidgetNode parentWidget = getParentWidget();
        ViewGroup.LayoutParams layoutParams = null;
        if (!(parentWidget instanceof j)) {
            parentWidget = null;
        }
        j jVar = (j) parentWidget;
        ViewGroup.LayoutParams layoutParams2 = editText.getLayoutParams();
        if (layoutParams2 == null) {
            if (jVar != null) {
                layoutParams = jVar.generateLayoutParams(this.beforeMeasureAttribute);
            }
        } else if (jVar != null) {
            layoutParams = jVar.generateLayoutParams(this.beforeMeasureAttribute, layoutParams2);
        }
        editText.setLayoutParams(layoutParams);
    }

    private final void postMyEvent(DxCustemDataEvent dxCustemDataEvent) {
        DXWidgetNode flattenWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b477d", new Object[]{this, dxCustemDataEvent});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        ckf.c(dXRuntimeContext, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
        DXRootView L = dXRuntimeContext.L();
        DXWidgetNode queryWTByUserId = (L == null || (flattenWidgetNode = L.getFlattenWidgetNode()) == null) ? null : flattenWidgetNode.queryWTByUserId(getUserId());
        if (queryWTByUserId != null) {
            queryWTByUserId.postEvent(dxCustemDataEvent);
        } else {
            postEvent(dxCustemDataEvent);
        }
    }

    private final void setNativeTextGravity(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5866a2f3", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setGravity(19);
        } else if (i == 1) {
            editText.setGravity(17);
        } else if (i != 2) {
            editText.setGravity(16);
        } else {
            editText.setGravity(21);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXGrowingTextInputViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public int getLineHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e80b222b", new Object[]{this})).intValue();
        }
        return getEditText().getLineHeight();
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public int getSelection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb420c50", new Object[]{this})).intValue();
        }
        return getEditText().getSelectionStart();
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        return getEditText().getText();
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void hideSoftInput() {
        Object obj;
        Context context;
        Context h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c129025", new Object[]{this});
            return;
        }
        TLog.loge(TAG, "hideSoftInput");
        MeasurableEditText editText = getEditText();
        editText.clearFocus();
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        Activity activity = null;
        if (dXRuntimeContext == null || (h = dXRuntimeContext.h()) == null) {
            obj = null;
        } else {
            obj = h.getSystemService("input_method");
        }
        if (!(obj instanceof InputMethodManager)) {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            if (dXRuntimeContext2 != null) {
                context = dXRuntimeContext2.h();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = context;
            }
            Activity activity2 = activity;
            if (activity2 != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                activity2.getWindow().setSoftInputMode(34);
            }
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void insert(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539fe764", new Object[]{this, charSequence});
            return;
        }
        ckf.h(charSequence, "charSequence");
        MeasurableEditText editText = getEditText();
        int selectionStart = editText.getSelectionStart();
        if (selectionStart == -1) {
            return;
        }
        if (this.maxLength <= 0 || editText.getEditableText().length() + charSequence.length() <= this.maxLength) {
            editText.getEditableText().insert(selectionStart, charSequence);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        ckf.h(dXWidgetNode, "widgetNode");
        DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = (DXGrowingTextInputViewWidgetNode) (!(dXWidgetNode instanceof DXGrowingTextInputViewWidgetNode) ? null : dXWidgetNode);
        if (dXGrowingTextInputViewWidgetNode != null) {
            super.onClone(dXWidgetNode, z);
            this.maxNumberOfLines = dXGrowingTextInputViewWidgetNode.maxNumberOfLines;
            this.minNumberOfLines = dXGrowingTextInputViewWidgetNode.minNumberOfLines;
            this.mLastSetText = dXGrowingTextInputViewWidgetNode.mLastSetText;
            this.forceRefreshSign = dXGrowingTextInputViewWidgetNode.forceRefreshSign;
            this.hasFilterFirstHideEvent = dXGrowingTextInputViewWidgetNode.hasFilterFirstHideEvent;
            this.text = dXGrowingTextInputViewWidgetNode.text;
            this.textColor = dXGrowingTextInputViewWidgetNode.textColor;
            this.textSize = dXGrowingTextInputViewWidgetNode.textSize;
            this.textGravity = dXGrowingTextInputViewWidgetNode.textGravity;
            this.placeHolder = dXGrowingTextInputViewWidgetNode.placeHolder;
            this.maxLength = dXGrowingTextInputViewWidgetNode.maxLength;
            this.placeHolderColor = dXGrowingTextInputViewWidgetNode.placeHolderColor;
            this.initTxt = dXGrowingTextInputViewWidgetNode.initTxt;
            this.enabledSpan = dXGrowingTextInputViewWidgetNode.enabledSpan;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.h(context, "context");
        final MeasurableEditText editText = getEditText();
        TraceUtil.beginSection("GrowingTextInput-considerInitKeyboardHelper");
        considerInitKeyboardHelper(editText);
        TraceUtil.endTrace();
        editText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mLastLine = 1;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (DXGrowingTextInputViewWidgetNode.access$getMaxNumberOfLines$p(DXGrowingTextInputViewWidgetNode.this) > 0 && this.mLastLine != editText.getLineCount() && editText.getLineCount() > 0 && editText.getLineCount() <= DXGrowingTextInputViewWidgetNode.access$getMaxNumberOfLines$p(DXGrowingTextInputViewWidgetNode.this)) {
                    this.mLastLine = editText.getLineCount();
                    Object tag = editText.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                    DXRuntimeContext dXRuntimeContext = null;
                    if (!(tag instanceof DXWidgetNode)) {
                        tag = null;
                    }
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) tag;
                    if (dXWidgetNode != null) {
                        dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
                    }
                    if (dXRuntimeContext != null) {
                        DXWidgetNode referenceNode = dXWidgetNode.getReferenceNode();
                        if (referenceNode != null) {
                            referenceNode.requestLayout();
                            return;
                        }
                        DXRuntimeContext dXRuntimeContext2 = DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext();
                        ckf.c(dXRuntimeContext2, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
                        dXRuntimeContext2.W().requestLayout();
                        return;
                    }
                    DXRuntimeContext dXRuntimeContext3 = DXGrowingTextInputViewWidgetNode.this.getDXRuntimeContext();
                    ckf.c(dXRuntimeContext3, "this@DXGrowingTextInputV…dgetNode.dxRuntimeContext");
                    dXRuntimeContext3.W().requestLayout();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                if (z) {
                    DXGrowingTextInputViewWidgetNode.this.showSoftInput();
                }
                DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(145138991613514032L);
                dxCustemDataEvent.put(Constants.Event.FOCUS, Boolean.valueOf(z));
                DXGrowingTextInputViewWidgetNode.access$postMyEvent(DXGrowingTextInputViewWidgetNode.this, dxCustemDataEvent);
            }
        });
        if (this.enabledSpan == 1) {
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onCreateView$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i == 67) {
                        ckf.c(keyEvent, "event");
                        if (keyEvent.getAction() == 0) {
                            DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = DXGrowingTextInputViewWidgetNode.this;
                            Editable editableText = editText.getEditableText();
                            ckf.c(editableText, "ed.editableText");
                            DXGrowingTextInputViewWidgetNode.access$onDeleteChar(dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode, editableText, editText);
                        }
                    }
                    return false;
                }
            });
        }
        return editText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == Integer.MIN_VALUE && size2 >= getMinHeight()) {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            ckf.c(dXRuntimeContext, "this.dxRuntimeContext");
            if (!(dXRuntimeContext.L().findViewById(R.id.mp_chat_input_id) instanceof MeasurableEditText)) {
                setMeasuredDimension(size, getMinHeight());
                return;
            }
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(i, i2);
            return;
        }
        MeasurableEditText editText = getEditText();
        onBeforeMeasure(editText);
        editText.onMeasure(i, i2);
        if (editText.getMeasuredHeightAndState() > getMinHeight()) {
            i3 = editText.getMeasuredHeightAndState();
        } else {
            i3 = getMinHeight();
        }
        setMeasuredDimension(editText.getMeasuredWidthAndState(), i3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ViewGroup viewGroup = null;
        if (!(view instanceof EditText)) {
            view = null;
        }
        EditText editText = (EditText) view;
        if (editText != null) {
            ViewParent parent = editText.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = parent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.setFocusableInTouchMode(true);
            }
            if (!ckf.b(this.text, this.mLastSetText)) {
                CharSequence charSequence = this.text;
                this.mLastSetText = charSequence;
                editText.setText(charSequence);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXGROWINGTEXTINPUTVIEW_MAXNUMBEROFLINES) {
            this.maxNumberOfLines = i;
        } else if (j == DXGROWINGTEXTINPUTVIEW_MINNUMBEROFLINES) {
            this.minNumberOfLines = i;
        } else if (j == 5737767606580872653L) {
            this.textColor = i;
        } else if (j == -1564827143683948874L) {
            this.textGravity = i;
        } else if (j == -2628107586387168847L) {
            this.maxLength = i;
        } else if (j == 1205272363096125842L) {
            this.placeHolderColor = i;
        } else if (j == DXGROWINGTEXTINPUTVIEW_SPANENABLED) {
            this.enabledSpan = i;
        } else if (j == 6751005219504497256L) {
            this.textSize = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXGROWINGTEXTINPUTVIEW_FORCEREFRESHSIGN) {
            this.forceRefreshSign = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.h(str, "attr");
        if (j == DXGROWINGTEXTINPUTVIEW_INITIALTXT) {
            this.initTxt = str;
        } else if (j == 38178040921L) {
            this.text = str;
        } else if (j == 5980555813819279758L) {
            this.placeHolder = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void performDeleteClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad01303", new Object[]{this});
        } else {
            getEditText().onKeyDown(67, new KeyEvent(0, 67));
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void postRequestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ccde850", new Object[]{this});
            return;
        }
        final MeasurableEditText editText = getEditText();
        editText.post(new Runnable() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$postRequestFocus$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MeasurableEditText.this.requestFocus();
                }
            }
        });
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void replace(int i, int i2, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18717e7f", new Object[]{this, new Integer(i), new Integer(i2), charSequence});
            return;
        }
        ckf.h(charSequence, "charSequence");
        MeasurableEditText editText = getEditText();
        if (i != -1 && i2 != -1) {
            if (this.maxLength <= 0 || editText.getEditableText().length() + charSequence.length() <= this.maxLength) {
                editText.getEditableText().replace(i, i2, charSequence);
            }
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        } else {
            getEditText().requestFocus();
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setSelection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f65a52", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            getEditText().setSelection(i);
        } catch (Throwable th) {
            TLog.loge(TAG, "setSelectionError:" + th.getMessage());
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setText(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7491ba", new Object[]{this, charSequence, new Boolean(z)});
        } else if (!ApplicationUtil.isDebug() || ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            MeasurableEditText editText = getEditText();
            int i = R.id.mp_chat_growing_text_init_finish;
            Boolean bool = (Boolean) editText.getTag(i);
            if (!z || bool == null) {
                if (z) {
                    getEditText().setTag(i, Boolean.TRUE);
                }
                this.isInitTxt = z;
                getEditText().setText(charSequence);
            }
        } else {
            throw new RuntimeException("must running in main thread!!");
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void showSoftInput() {
        Context h;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd2fa4a", new Object[]{this});
        } else if (System.currentTimeMillis() - this.lastRequestShowKeyboardMillis >= 600) {
            this.lastRequestShowKeyboardMillis = System.currentTimeMillis();
            MeasurableEditText editText = getEditText();
            editText.requestFocus();
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null && (h = dXRuntimeContext.h()) != null) {
                InputMethodManager inputMethodManager = null;
                if (!(h instanceof Activity)) {
                    context = null;
                } else {
                    context = h;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (activity.isFinishing()) {
                        activity = null;
                    }
                    if (activity != null) {
                        Object systemService = h.getSystemService("input_method");
                        if (systemService instanceof InputMethodManager) {
                            inputMethodManager = systemService;
                        }
                        InputMethodManager inputMethodManager2 = inputMethodManager;
                        if (inputMethodManager2 != null) {
                            inputMethodManager2.showSoftInput(editText, 0);
                            activity.getWindow().setSoftInputMode(18);
                        }
                    }
                }
            }
        }
    }

    private final MeasurableEditText createNativeView() {
        MeasurableEditText measurableEditText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasurableEditText) ipChange.ipc$dispatch("f01b3502", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            ckf.c(dXRuntimeContext, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
            measurableEditText = new MeasurableEditText(dXRuntimeContext.h());
            measurableEditText.setCursorVisible(true);
            measurableEditText.setTextColor((int) 4281545523L);
            measurableEditText.setHintTextColor((int) 4288256409L);
            measurableEditText.setTextCursorDrawable(R.drawable.shape_edittext_cursor);
        } else {
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            ckf.c(dXRuntimeContext2, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
            View inflate = LayoutInflater.from(dXRuntimeContext2.h()).inflate(R.layout.msg_growing_text_input, (ViewGroup) null);
            if (inflate != null) {
                measurableEditText = (MeasurableEditText) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.chat.component.chatinput.view.widget.MeasurableEditText");
            }
        }
        measurableEditText.setId(R.id.mp_chat_input_id);
        measurableEditText.setBackground(null);
        return measurableEditText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, final View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.h(view, "weakView");
        if (j == 5288679823228297259L) {
            int i = jn7.TEXT_WATCHER;
            Object tag = view.getTag(i);
            if (!(tag instanceof InputTextWatcher)) {
                tag = null;
            }
            InputTextWatcher inputTextWatcher = (InputTextWatcher) tag;
            if (inputTextWatcher != null) {
                ((EditText) view).removeTextChangedListener(inputTextWatcher);
            }
            InputTextWatcher inputTextWatcher2 = new InputTextWatcher(this, view);
            view.setTag(i, inputTextWatcher2);
            ((EditText) view).addTextChangedListener(inputTextWatcher2);
        } else if (j != DXGROWINGTEXTINPUTVIEW_SPANCHANGE) {
            super.onBindEvent(context, view, j);
        } else if (this.enabledSpan == 1) {
            ((EditText) view).setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.message.chat.component.chatinput.node.DXGrowingTextInputViewWidgetNode$onBindEvent$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("bdbaa648", new Object[]{this, view2, new Integer(i2), keyEvent})).booleanValue();
                    }
                    if (i2 == 67) {
                        ckf.c(keyEvent, "event");
                        if (keyEvent.getAction() == 0) {
                            DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode = DXGrowingTextInputViewWidgetNode.this;
                            Editable editableText = ((EditText) view).getEditableText();
                            ckf.c(editableText, "weakView.editableText");
                            return DXGrowingTextInputViewWidgetNode.access$onDeleteChar(dXGrowingTextInputViewWidgetNode, dXGrowingTextInputViewWidgetNode, editableText, view);
                        }
                    }
                    return false;
                }
            });
        }
    }

    private final void setupNativeView(EditText editText) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4607017f", new Object[]{this, editText});
        } else if (editText != null) {
            editText.setHint(this.placeHolder);
            editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.placeHolderColor));
            editText.setTextSize(0, this.textSize);
            editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
            setNativeTextGravity(editText, this.textGravity);
            editText.setOnTouchListener(DXGrowingTextInputViewWidgetNode$setupNativeView$1.INSTANCE);
            if (this.maxLength <= 0) {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.maxLength)});
            }
            if (this.maxNumberOfLines > 0) {
                editText.setInputType(editText.getInputType() | 131072);
                if (this.maxNumberOfLines != 1) {
                    z = false;
                }
                editText.setSingleLine(z);
                editText.setMaxLines(this.maxNumberOfLines);
                editText.setPadding(0, DisplayUtil.dip2px(DinamicXEngine.x(), 2.0f), 0, DisplayUtil.dip2px(DinamicXEngine.x(), 2.0f));
            }
            int i = this.minNumberOfLines;
            if (i > 0) {
                editText.setMinLines(i);
            }
            String str = this.initTxt;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    editText.setText(str);
                }
            }
        }
    }

    private final boolean onDeleteChar(DXGrowingTextInputViewWidgetNode dXGrowingTextInputViewWidgetNode, Editable editable, View view) {
        boolean z;
        DxCustemDataEvent dxCustemDataEvent;
        DxCustemDataEvent dxCustemDataEvent2;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a519c9a6", new Object[]{this, dXGrowingTextInputViewWidgetNode, editable, view})).booleanValue();
        }
        try {
            int selectionStart = Selection.getSelectionStart(editable);
            if (selectionStart == Selection.getSelectionEnd(editable) && selectionStart > 0) {
                if (Character.isWhitespace(editable.charAt(selectionStart - 1))) {
                    selectionStart--;
                    z = true;
                } else {
                    z = false;
                }
                AtSpan[] atSpanArr = (AtSpan[]) editable.getSpans(selectionStart, selectionStart, AtSpan.class);
                if (atSpanArr.length > 0) {
                    int length = atSpanArr.length;
                    for (int i = 0; i < length; i++) {
                        if (selectionStart == editable.getSpanStart(atSpanArr[i])) {
                            return false;
                        }
                        String str = "";
                        if (z) {
                            editable.replace(editable.getSpanStart(atSpanArr[i]), editable.getSpanEnd(atSpanArr[i]) + 1, str);
                        } else {
                            editable.replace(editable.getSpanStart(atSpanArr[i]), editable.getSpanEnd(atSpanArr[i]), str);
                        }
                        editable.removeSpan(atSpanArr[i]);
                        try {
                            dxCustemDataEvent = new DxCustemDataEvent(DXGROWINGTEXTINPUTVIEW_SPANCHANGE);
                            AtSpan atSpan = atSpanArr[i];
                            ckf.c(atSpan, "linkSpans[i]");
                            String targetId = atSpan.getTargetId();
                            ckf.c(targetId, "linkSpans[i].targetId");
                            dxCustemDataEvent.put("targetId", targetId);
                            AtSpan atSpan2 = atSpanArr[i];
                            ckf.c(atSpan2, "linkSpans[i]");
                            String nick = atSpan2.getNick();
                            ckf.c(nick, "linkSpans[i].nick");
                            dxCustemDataEvent.put("nickName", nick);
                            dXGrowingTextInputViewWidgetNode.postEvent(dxCustemDataEvent);
                            dxCustemDataEvent2 = new DxCustemDataEvent(5288679823228297259L);
                        } catch (Throwable unused) {
                        }
                        if (view == null) {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
                            break;
                        }
                        Editable text = ((EditText) view).getText();
                        if (!(text == null || (obj = text.toString()) == null)) {
                            str = obj;
                        }
                        dxCustemDataEvent2.put("text", str);
                        dXGrowingTextInputViewWidgetNode.postEvent(dxCustemDataEvent);
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.message.chat.component.chatinput.node.IGrowingTextInput
    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else if (!ApplicationUtil.isDebug() || ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            setText(charSequence, false);
        } else {
            throw new RuntimeException("must running in main thread!!");
        }
    }
}
