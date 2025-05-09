package com.taobao.detail.rate.jsbridge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.detail.rate.RateDisplayApplication;
import com.taobao.detail.rate.v2.RateViewPagerFragmentV2;
import com.taobao.tao.Globals;
import tb.jhn;
import tb.kpw;
import tb.n9l;
import tb.odg;
import tb.uhn;
import tb.vgn;
import tb.ykz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WVPreviewPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver imagePreviewReceiver = new BroadcastReceiver() { // from class: com.taobao.detail.rate.jsbridge.WVPreviewPlugin.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/jsbridge/WVPreviewPlugin$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && intent.getAction().equalsIgnoreCase("taobao.ocean.imagepreview.broadcast")) {
                String stringExtra = intent.getStringExtra("actionName");
                String stringExtra2 = intent.getStringExtra("bizData");
                if (WVPreviewPlugin.access$000(WVPreviewPlugin.this) != null) {
                    WVPreviewPlugin.access$000(WVPreviewPlugin.this).fireEvent(stringExtra, stringExtra2);
                }
            }
        }
    };
    private WVCallBackContext previewCallback;

    public WVPreviewPlugin() {
        IntentFilter intentFilter = new IntentFilter("taobao.ocean.imagepreview.broadcast");
        if (this.imagePreviewReceiver != null) {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.imagePreviewReceiver, intentFilter);
        }
    }

    public static /* synthetic */ WVCallBackContext access$000(WVPreviewPlugin wVPreviewPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("6a3782ac", new Object[]{wVPreviewPlugin});
        }
        return wVPreviewPlugin.previewCallback;
    }

    public static /* synthetic */ Object ipc$super(WVPreviewPlugin wVPreviewPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/jsbridge/WVPreviewPlugin");
    }

    private void openPreviewV2(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9547a9dd", new Object[]{this, str, context});
        } else if (context instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putString("tagId", str);
            RateViewPagerFragmentV2 rateViewPagerFragmentV2 = new RateViewPagerFragmentV2();
            rateViewPagerFragmentV2.setArguments(bundle);
            FragmentTransaction beginTransaction = ((FragmentActivity) context).getSupportFragmentManager().beginTransaction();
            beginTransaction.add(rateViewPagerFragmentV2, "RateViewPagerFragmentV2");
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            this.previewCallback = null;
            if (this.imagePreviewReceiver != null) {
                LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.imagePreviewReceiver);
                this.imagePreviewReceiver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onOpenPreviewV2(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba5145e", new Object[]{this, str, str2, bundle});
        } else if (n9l.INSTANCE.l()) {
            if (ykz.h()) {
                Nav.from(this.mContext).withExtras(bundle).toUri(str2);
            } else {
                openPreviewV2(str, this.mContext);
                vgn.i("rateFeature downgrade");
                uhn.e("Page_DetailComments2", "RateFeatureDownloadError", null);
                odg.c("WVPreviewPlugin", "rateFeature downgrade");
            }
            uhn.e("Page_DetailComments2", "RateFeatureDownload", null);
        } else if (jhn.INSTANCE.b()) {
            openPreviewV2(str, this.mContext);
        } else {
            Nav.from(this.mContext).withExtras(bundle).toUri(str2);
        }
    }

    private void openPreviewAcitivity(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959ac304", new Object[]{this, str, wVCallBackContext});
            return;
        }
        odg.d("RatePreview", "openPreviewActivity.start");
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                JSONObject jSONObject = parseObject.getJSONObject("data");
                String string = parseObject.getString("url");
                if (jSONObject != null) {
                    String string2 = jSONObject.getString("bizType");
                    RateDisplayApplication.clear();
                    if (!TextUtils.isEmpty(string)) {
                        Bundle bundle = new Bundle();
                        if ("rate".equals(string2)) {
                            bundle.putBoolean("isNewRate", true);
                        } else {
                            bundle.putBoolean("isNewPreview", true);
                        }
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        bundle.putString("tagId", valueOf);
                        RateDisplayApplication.previewDataMap.put(valueOf, jSONObject);
                        onOpenPreviewV2(valueOf, string, bundle);
                        if (wVCallBackContext != null) {
                            wVCallBackContext.success();
                        }
                    } else {
                        RateDisplayApplication.previewDatas = jSONObject;
                        onOpenPreviewV2("", "http://h5.m.taobao.com/rate/imagepreview.htm?preview=true", null);
                        if (wVCallBackContext != null) {
                            wVCallBackContext.success();
                        }
                    }
                }
            }
            odg.d("RatePreview", "openPreviewActivity.end");
            this.previewCallback = wVCallBackContext;
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"openPreview".equals(str)) {
            return false;
        }
        openPreviewAcitivity(str2, wVCallBackContext);
        return true;
    }
}
