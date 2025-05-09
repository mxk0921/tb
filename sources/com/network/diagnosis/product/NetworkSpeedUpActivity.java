package com.network.diagnosis.product;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.acq;
import tb.qxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NetworkSpeedUpActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Switch f5961a;
    public Switch b;
    public RelativeLayout c;

    public static /* synthetic */ Object ipc$super(NetworkSpeedUpActivity networkSpeedUpActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/network/diagnosis/product/NetworkSpeedUpActivity");
        }
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

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_speed_up);
        getSupportActionBar().setTitle(Localization.q(R.string.taobao_app_1012_1_14010));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.nd_white));
        Switch r5 = (Switch) findViewById(R.id.switch_settings_multi_path);
        this.f5961a = r5;
        r5.setChecked(NetworkConfigCenter.isMultiPathOpened());
        this.f5961a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.network.diagnosis.product.NetworkSpeedUpActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else {
                    NetworkConfigCenter.setMultiPathOpened(z);
                }
            }
        });
        this.c = (RelativeLayout) findViewById(R.id.layout_settings_multi_quic);
        if (qxn.e()) {
            this.c.setVisibility(0);
        }
        Switch r52 = (Switch) findViewById(R.id.switch_settings_multi_quic);
        this.b = r52;
        r52.setChecked(NetworkConfigCenter.isMPQuicOpened());
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.network.diagnosis.product.NetworkSpeedUpActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else {
                    NetworkConfigCenter.setMPQuicOpened(z);
                }
            }
        });
    }
}
