package com.taobao.detail.rate.vivid.dinamicX.view.error;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.jk;
import tb.odg;
import tb.sc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001DB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R$\u0010&\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R$\u0010)\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R$\u0010,\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", sc.initView, "()V", "Landroid/view/View;", "viewExtend", "Landroid/view/View;", "", "apiName", "Ljava/lang/String;", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "buttonTitle", "getButtonTitle", "setButtonTitle", "errorMsg", "getErrorMsg", "setErrorMsg", "iconUrl", "getIconUrl", "setIconUrl", jk.KEY_MAPPING_CODE, "getMappingCode", "setMappingCode", TBImageFlowMonitor.RESPONSE_CODE_MEASURE, "getResponseCode", "setResponseCode", jk.KEY_RET_CODE, "getRetCode", "setRetCode", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "Lcom/alibaba/fastjson/JSONObject;", "userMtopInfo", "Lcom/alibaba/fastjson/JSONObject;", "getUserMtopInfo", "()Lcom/alibaba/fastjson/JSONObject;", "setUserMtopInfo", "(Lcom/alibaba/fastjson/JSONObject;)V", "Lcom/taobao/uikit/extend/component/TBErrorView;", "tbErrorView", "Lcom/taobao/uikit/extend/component/TBErrorView;", "getTbErrorView", "()Lcom/taobao/uikit/extend/component/TBErrorView;", "setTbErrorView", "(Lcom/taobao/uikit/extend/component/TBErrorView;)V", "Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$a;", "buttonListener", "Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$a;", "getButtonListener", "()Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$a;", "setButtonListener", "(Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$a;)V", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DisplayErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String apiName;
    private a buttonListener;
    private String buttonTitle;
    private String errorMsg;
    private String iconUrl;
    private String mappingCode;
    private String responseCode;
    private String retCode;
    private String subTitle;
    private TBErrorView tbErrorView;
    private String title;
    private JSONObject userMtopInfo;
    private View viewExtend;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void i();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10375a;
        public final /* synthetic */ DisplayErrorView b;

        public b(String str, DisplayErrorView displayErrorView) {
            this.f10375a = str;
            this.b = displayErrorView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a buttonListener = this.b.getButtonListener();
            if (buttonListener != null) {
                buttonListener.i();
            }
            odg.c(RateFeedsFragment.TAG, "error view click, " + this.f10375a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_rate_error_view, (ViewGroup) this, false);
        this.viewExtend = inflate;
        View findViewById = inflate != null ? inflate.findViewById(R.id.tb_rate_error_view) : null;
        if (findViewById != null) {
            this.tbErrorView = (TBErrorView) findViewById;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.component.TBErrorView");
    }

    public static /* synthetic */ Object ipc$super(DisplayErrorView displayErrorView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView");
    }

    public final String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return this.apiName;
    }

    public final a getButtonListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4e16171a", new Object[]{this});
        }
        return this.buttonListener;
    }

    public final String getButtonTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c0977e9", new Object[]{this});
        }
        return this.buttonTitle;
    }

    public final String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public final String getIconUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.iconUrl;
    }

    public final String getMappingCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d754d74", new Object[]{this});
        }
        return this.mappingCode;
    }

    public final String getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45f50135", new Object[]{this});
        }
        return this.responseCode;
    }

    public final String getRetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.retCode;
    }

    public final String getSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9c4664b", new Object[]{this});
        }
        return this.subTitle;
    }

    public final TBErrorView getTbErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("7bcc3229", new Object[]{this});
        }
        return this.tbErrorView;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final JSONObject getUserMtopInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8bce1e", new Object[]{this});
        }
        return this.userMtopInfo;
    }

    public final void setApiName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            this.apiName = str;
        }
    }

    public final void setButtonListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bb0378", new Object[]{this, aVar});
        } else {
            this.buttonListener = aVar;
        }
    }

    public final void setButtonTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdcb415", new Object[]{this, str});
        } else {
            this.buttonTitle = str;
        }
    }

    public final void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public final void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.iconUrl = str;
        }
    }

    public final void setMappingCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eb8fea", new Object[]{this, str});
        } else {
            this.mappingCode = str;
        }
    }

    public final void setResponseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94999e1", new Object[]{this, str});
        } else {
            this.responseCode = str;
        }
    }

    public final void setRetCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66ccfd", new Object[]{this, str});
        } else {
            this.retCode = str;
        }
    }

    public final void setSubTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a5bd8b", new Object[]{this, str});
        } else {
            this.subTitle = str;
        }
    }

    public final void setTbErrorView(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c536e5", new Object[]{this, tBErrorView});
        } else {
            this.tbErrorView = tBErrorView;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setUserMtopInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2cb426", new Object[]{this, jSONObject});
        } else {
            this.userMtopInfo = jSONObject;
        }
    }

    public final void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        removeAllViews();
        TBErrorView tBErrorView = this.tbErrorView;
        if (tBErrorView != null) {
            tBErrorView.setIconUrl(this.iconUrl);
            tBErrorView.setTitle(this.title);
            tBErrorView.setSubTitle(this.subTitle);
            JSONObject jSONObject = this.userMtopInfo;
            if (jSONObject != null) {
                this.mappingCode = jSONObject.getString(jk.KEY_MAPPING_CODE);
                this.responseCode = jSONObject.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE);
                this.retCode = jSONObject.getString(jk.KEY_RET_CODE);
                this.errorMsg = jSONObject.getString("errorMsg");
            }
            String str = this.apiName;
            String str2 = this.responseCode;
            tBErrorView.setError(Error.Factory.fromMtopResponse(str, str2 != null ? Integer.parseInt(str2) : 0, this.mappingCode, this.retCode, this.errorMsg));
            String str3 = this.responseCode;
            String str4 = "apiName = " + this.apiName + " , responseCode = " + (str3 != null ? Integer.parseInt(str3) : 0) + ", mappingCode = " + this.mappingCode + " ,retCode = " + this.mappingCode + " , retCode = " + this.retCode + " , errorMsg = " + this.errorMsg;
            odg.c(RateFeedsFragment.TAG, "error view show, " + str4);
            if (!TextUtils.isEmpty(this.buttonTitle)) {
                tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, this.buttonTitle, new b(str4, this));
            }
        }
        addView(this.viewExtend);
    }

    public /* synthetic */ DisplayErrorView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
