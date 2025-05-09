package tb;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qi8 extends ky<CustomBaseActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ViewGroup b;
    public TBErrorView c;

    static {
        t2o.a(764411987);
    }

    public qi8(CustomBaseActivity customBaseActivity, ViewGroup viewGroup) {
        super(customBaseActivity);
        this.b = viewGroup;
    }

    public static /* synthetic */ Object ipc$super(qi8 qi8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/homepage/manager/ErrorViewManager");
    }

    @Override // tb.ky
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        int i = R.id.error;
        TBErrorView tBErrorView = (TBErrorView) viewGroup.findViewById(i);
        this.c = tBErrorView;
        if (tBErrorView == null) {
            LayoutInflater.from(this.f22996a).inflate(R.layout.shop_error_view, this.b);
            this.c = (TBErrorView) this.b.findViewById(i);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a1006a", new Object[]{this});
        } else {
            this.c.setVisibility(8);
        }
    }

    public final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        return this.f22996a.getResources().getString(i);
    }

    public void e(MtopResponse mtopResponse, String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4d08fb", new Object[]{this, mtopResponse, str, str2, onClickListener});
            return;
        }
        if (mtopResponse != null) {
            String retCode = mtopResponse.getRetCode();
            if (TextUtils.equals("ERROR_SHOP", retCode) || TextUtils.equals("ERROR_STATUS", retCode) || TextUtils.equals("ERROR_PARAMS", retCode)) {
                this.c.setTitle(ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
                this.c.setSubTitle("别紧张，试试看刷新页面");
            } else {
                this.c.setTitle(mtopResponse.getRetMsg());
                this.c.setSubTitle(mtopResponse.getRetCode());
            }
            this.c.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        } else {
            this.c.setTitle(str2);
            this.c.setSubTitle(str);
            this.c.setError(Error.Factory.newError(str, str2));
        }
        this.c.setButton(TBErrorView.ButtonType.BUTTON_LEFT, d(R.string.shop_error_reload_text), onClickListener);
        f();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
        } else {
            this.c.setVisibility(0);
        }
    }
}
