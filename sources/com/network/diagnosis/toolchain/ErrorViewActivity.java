package com.network.diagnosis.toolchain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import org.json.JSONObject;
import tb.acq;
import tb.ii8;
import tb.ji8;
import tb.jk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ErrorViewActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBErrorView f5962a;
    public TBErrorViewWidget b;
    public RelativeLayout c;

    public static /* synthetic */ Object ipc$super(ErrorViewActivity errorViewActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/network/diagnosis/toolchain/ErrorViewActivity");
        }
    }

    public static /* synthetic */ TBErrorViewWidget l3(ErrorViewActivity errorViewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorViewWidget) ipChange.ipc$dispatch("c55ad756", new Object[]{errorViewActivity});
        }
        return errorViewActivity.b;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final TBErrorView.UserInterfaceStyle n3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView.UserInterfaceStyle) ipChange.ipc$dispatch("15ac37bd", new Object[]{this, str});
        }
        TBErrorView.UserInterfaceStyle userInterfaceStyle = TBErrorView.UserInterfaceStyle.UNSPECIFIED;
        if (TextUtils.isEmpty(str)) {
            return userInterfaceStyle;
        }
        try {
            return TBErrorView.UserInterfaceStyle.valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return userInterfaceStyle;
        }
    }

    public final TBErrorViewWidget.UserInterfaceStyle o3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorViewWidget.UserInterfaceStyle) ipChange.ipc$dispatch("3f363d", new Object[]{this, str});
        }
        TBErrorViewWidget.UserInterfaceStyle userInterfaceStyle = TBErrorViewWidget.UserInterfaceStyle.UNSPECIFIED;
        if (TextUtils.isEmpty(str)) {
            return userInterfaceStyle;
        }
        try {
            return TBErrorViewWidget.UserInterfaceStyle.valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return userInterfaceStyle;
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_error_view);
        this.f5962a = (TBErrorView) findViewById(R.id.error_view);
        this.b = (TBErrorViewWidget) findViewById(R.id.error_view_widget);
        this.c = (RelativeLayout) findViewById(R.id.layout_bg);
        m3();
    }

    public final void p3(JSONObject jSONObject, TBErrorViewWidget.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285ca0f5", new Object[]{this, jSONObject, status});
        } else if (status == TBErrorViewWidget.Status.STATUS_CUSTOM) {
            String optString = jSONObject.optString("title", "custom title");
            int optInt = jSONObject.optInt("buttons", 4);
            String optString2 = jSONObject.optString("btnText", "update");
            boolean optBoolean = jSONObject.optBoolean("withProgress", true);
            this.b.setCustomTitle(optString);
            this.b.setCustomEnableButtons(optInt);
            if (optBoolean) {
                this.b.setRefreshButtonWithProgress(optString2, jSONObject.optString("btnRunningText", "updating"), null);
            } else {
                this.b.setRefreshButtonWithoutProgress(optString2, null);
            }
        }
    }

    public final void m3() {
        Uri data;
        TBErrorViewWidget.Status valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("data");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    JSONObject jSONObject = new JSONObject(queryParameter);
                    if (!jSONObject.optBoolean("noTitle", false)) {
                        getSupportActionBar().show();
                        getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1012_1_14017));
                        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.nd_white));
                    } else {
                        getSupportActionBar().hide();
                    }
                    if (jSONObject.optBoolean("darkMode", false)) {
                        this.c.setBackgroundColor(-12303292);
                    } else {
                        this.c.setBackgroundColor(-1);
                    }
                    this.f5962a.setNotShowNetworkDiagnosisView(!jSONObject.optBoolean("enableDiagnosis", true));
                    String optString = jSONObject.optString("buttonText", Localization.q(R.string.taobao_app_1012_1_14015));
                    if (!TextUtils.isEmpty(optString)) {
                        this.f5962a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, optString, new ii8(this));
                    }
                    int i = jSONObject.getInt(TBImageFlowMonitor.RESPONSE_CODE_MEASURE);
                    String string = jSONObject.getString(jk.KEY_MAPPING_CODE);
                    String string2 = jSONObject.getString(jk.KEY_RET_CODE);
                    String string3 = jSONObject.getString("errorMsg");
                    String optString2 = jSONObject.optString("apiName", "");
                    String optString3 = jSONObject.optString("reqFalcoId", "");
                    this.f5962a.setError(Error.Factory.fromMtopResponse(optString2, i, string, string2, string3, optString3));
                    String optString4 = jSONObject.optString("interfaceStyle", "");
                    TBErrorView.UserInterfaceStyle n3 = n3(optString4);
                    this.f5962a.setUserInterfaceStyle(n3);
                    if (n3 == TBErrorView.UserInterfaceStyle.DARK) {
                        this.c.setBackgroundColor(-16777216);
                    }
                    if (jSONObject.optBoolean("enableWidget", false)) {
                        String optString5 = jSONObject.optString("status", null);
                        if (!TextUtils.isEmpty(optString5)) {
                            TBErrorViewWidget.Status status = TBErrorViewWidget.Status.STATUS_SYSTEM_ERROR;
                            try {
                                valueOf = TBErrorViewWidget.Status.valueOf(optString5.toUpperCase());
                            } catch (Exception unused) {
                            }
                            this.b.setStatus(valueOf);
                            p3(jSONObject, valueOf);
                        } else {
                            this.b.setError(Error.Factory.fromMtopResponse(optString2, i, string, string2, string3, optString3));
                        }
                        this.b.setUserInterfaceStyle(o3(optString4));
                        this.b.setAdaptiveWidth(true);
                        this.f5962a.setVisibility(4);
                        this.b.postDelayed(new ji8(this), 500L);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }
}
