package com.taobao.umipublish.extension.windvane.innercall;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.umipublish.extension.windvane.IMaterialVersionChecker;
import com.taobao.umipublish.extension.windvane.innercall.NavWrapperFragment;
import tb.dov;
import tb.jxk;
import tb.kdp;
import tb.knv;
import tb.odg;
import tb.pj8;
import tb.t2o;
import tb.ypc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InnerOpenRecordAbility extends InnerCallBaseAbility implements NavWrapperFragment.ActivityResult {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_INNER_OPEN_RECORD_PAGE = "event_inner_open_record_page";
    private static final String NEW_RECORD_PATH = "https://h5.m.taobao.com/litecreator/no_result_record.html";
    private static final int REQUEST_CODE = 3301;
    private static final String TAG = "InnerOpenRecordAbility";

    static {
        t2o.a(944767217);
        t2o.a(944767220);
    }

    public static /* synthetic */ void access$000(InnerOpenRecordAbility innerOpenRecordAbility, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319e7311", new Object[]{innerOpenRecordAbility, jSONObject});
        } else {
            innerOpenRecordAbility.openRecord(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(InnerOpenRecordAbility innerOpenRecordAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0e03f2", new Object[]{innerOpenRecordAbility, str, str2});
        } else {
            innerOpenRecordAbility.errorCallback(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(InnerOpenRecordAbility innerOpenRecordAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/InnerOpenRecordAbility");
    }

    private void openRecord(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2fcee", new Object[]{this, jSONObject});
            return;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) this.mContext).getSupportFragmentManager();
        if (!supportFragmentManager.isDestroyed()) {
            NavWrapperFragment navWrapperFragment = new NavWrapperFragment(this);
            supportFragmentManager.beginTransaction().add(navWrapperFragment, (String) null).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
            onPageEnter(jSONObject);
            Nav.from(this.mContext).withFragment(navWrapperFragment).forResult(REQUEST_CODE).toUri(knv.c(NEW_RECORD_PATH, jSONObject));
            return;
        }
        errorCallback("3", "ACTIVITY_FINISHED");
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.InnerCallBaseAbility
    public void onExecute(final JSONObject jSONObject, dov.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1150513", new Object[]{this, jSONObject, aVar});
        } else {
            ((IMaterialVersionChecker) kdp.a(IMaterialVersionChecker.class, new Object[0])).check(this.mContext, 0, jSONObject, new ypc.a() { // from class: com.taobao.umipublish.extension.windvane.innercall.InnerOpenRecordAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ypc.a
                public void a(MaterialDetail materialDetail, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("62ff7e2c", new Object[]{this, materialDetail, str, str2});
                    } else {
                        InnerOpenRecordAbility.access$100(InnerOpenRecordAbility.this, str, str2);
                    }
                }

                @Override // tb.ypc.a
                public void b(MaterialDetail materialDetail) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b8060a9d", new Object[]{this, materialDetail});
                    } else {
                        InnerOpenRecordAbility.access$000(InnerOpenRecordAbility.this, jSONObject);
                    }
                }
            });
        }
    }

    public void onPageEnter(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07d8b1f", new Object[]{this, jSONObject});
            return;
        }
        updateUrlPrams(jSONObject);
        pj8.b().d(EVENT_INNER_OPEN_RECORD_PAGE, jxk.c().d("event", g4.b.i));
    }

    public void onPageExit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af724cdd", new Object[]{this, str});
            return;
        }
        revertUrlParams();
        pj8.b().d(EVENT_INNER_OPEN_RECORD_PAGE, jxk.c().d("event", "exit"));
    }

    @Override // com.taobao.umipublish.extension.windvane.innercall.NavWrapperFragment.ActivityResult
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        odg.d(TAG, "requestCode=" + i + ", resultCode=" + i2);
        if (i == REQUEST_CODE) {
            onPageExit(this.mSessionId);
            errorCallback(PreRequestPresenter.SOURCE_RATE_HISTORY, "USER_CANCELED");
        }
    }
}
