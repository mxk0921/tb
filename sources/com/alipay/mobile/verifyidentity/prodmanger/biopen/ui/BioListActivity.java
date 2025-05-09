package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioMenuData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioPageData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.MenuGroup;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.APListView;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.acq;
import tb.iv8;
import tb.upx;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioListActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView A;
    public RelativeLayout B;
    public int D;
    public BioListAdapter E;
    public BioListAdapter F;
    public BroadcastReceiver G;
    public BroadcastReceiver H;
    public LocalBroadcastManager I;
    public long J;
    public Bundle K;
    public Bundle N;
    public String O;
    public String P;
    public String Q;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public String m;
    public String n;
    public String o;
    public ArrayList<BioMenuData> p;
    public ArrayList<BioMenuData> q;
    public Map<String, String> s;
    public APListView t;
    public APListView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;
    public boolean l = true;
    public final ArrayList<BioMenuData> r = new ArrayList<>();
    public int C = 0;

    public static /* synthetic */ void access$000(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5580da0e", new Object[]{bioListActivity});
        } else {
            bioListActivity.h();
        }
    }

    public static /* synthetic */ String access$100(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c688f893", new Object[]{bioListActivity});
        }
        return bioListActivity.Q;
    }

    public static /* synthetic */ String access$1000(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8525d081", new Object[]{bioListActivity});
        }
        return bioListActivity.o;
    }

    public static /* synthetic */ boolean access$1100(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc17d3a2", new Object[]{bioListActivity})).booleanValue();
        }
        return bioListActivity.k;
    }

    public static /* synthetic */ void access$1200(BioListActivity bioListActivity, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0c3537", new Object[]{bioListActivity, new Boolean(z)});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioListActivity.this.showProgressDialog("", false, null);
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                        mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                        mICProdmngRequest.action = "changeIntelligent";
                        HashMap hashMap = new HashMap();
                        mICProdmngRequest.params = hashMap;
                        hashMap.put("intelligentEnable", String.valueOf(z));
                        mICProdmngRequest.params.put("_rpcSource_", "ALIAPP");
                        if (BioListActivity.access$1300(BioListActivity.this) != null) {
                            mICProdmngRequest.params.put("tbsid", BioListActivity.access$1300(BioListActivity.this).getString("tbsid"));
                            String access$1400 = BioListActivity.access$1400();
                            VerifyLogCat.i(access$1400, "tbsid:" + BioListActivity.access$1300(BioListActivity.this).getString("tbsid"));
                        }
                        String access$14002 = BioListActivity.access$1400();
                        VerifyLogCat.i(access$14002, "opens:" + z);
                        BioListActivity.access$1500(BioListActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), z);
                    } catch (RpcException unused) {
                        BioListActivity.this.dismissProgressDialog();
                        BioListActivity.access$1500(BioListActivity.this, null, z);
                        VerifyLogCat.e(BioListActivity.access$1400(), "RpcException");
                    }
                }
            }, "sendintelligentRpc");
        }
    }

    public static /* synthetic */ Bundle access$1300(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("43d754a0", new Object[]{bioListActivity});
        }
        return bioListActivity.K;
    }

    public static /* synthetic */ String access$1400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6b45c36", new Object[0]);
        }
        return "BioListActivity";
    }

    public static /* synthetic */ void access$1600(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791e6bb9", new Object[]{bioListActivity});
        } else {
            bioListActivity.g();
        }
    }

    public static /* synthetic */ boolean access$1700(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("921fbd5c", new Object[]{bioListActivity})).booleanValue();
        }
        return bioListActivity.j;
    }

    public static /* synthetic */ ArrayList access$1800(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("438dd151", new Object[]{bioListActivity});
        }
        return bioListActivity.p;
    }

    public static /* synthetic */ void access$1900(BioListActivity bioListActivity, final int i, String str, Bundle bundle, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932d5a47", new Object[]{bioListActivity, new Integer(i), str, bundle, str2});
        } else {
            ProductManagerEngine.getInstance(MicroModuleContext.getInstance().getContext()).startByToken("", str, "REGISTER_BIO_PREPARE", bundle, new ProdManagerListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.callback.ProdManagerListener
                public final void onResult(String str3, ProdManagerResult prodManagerResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26d0dee4", new Object[]{this, str3, prodManagerResult});
                        return;
                    }
                    if (prodManagerResult != null) {
                        if ("1000".equalsIgnoreCase(prodManagerResult.getCode())) {
                            BioListActivity bioListActivity2 = BioListActivity.this;
                            bioListActivity2.toast(bioListActivity2.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                            BioListActivity.access$2200(BioListActivity.this, i, "open", str2);
                            return;
                        } else if ("2006".equalsIgnoreCase(prodManagerResult.getCode())) {
                            BioListActivity bioListActivity3 = BioListActivity.this;
                            BioListActivity.access$2300(bioListActivity3, bioListActivity3.getResources().getString(R.string.face_try_again_title), BioListActivity.this.getResources().getString(R.string.face_confirm_context));
                            BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                            return;
                        } else if (!"1001".equalsIgnoreCase(prodManagerResult.getCode())) {
                            if ("2003".equalsIgnoreCase(prodManagerResult.getCode()) || "RPC_EXCEPTION".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity bioListActivity4 = BioListActivity.this;
                                bioListActivity4.toast(bioListActivity4.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
                                BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                                return;
                            } else if ("1004".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity bioListActivity5 = BioListActivity.this;
                                bioListActivity5.toast(bioListActivity5.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                                BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                                return;
                            } else if ("1003".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                                return;
                            } else if (iv8.FCANVAS_ERROR_OPEN_GL.equalsIgnoreCase(prodManagerResult.getCode())) {
                                String message = prodManagerResult.getMessage();
                                BioListActivity bioListActivity6 = BioListActivity.this;
                                if (TextUtils.isEmpty(message)) {
                                    message = BioListActivity.this.getResources().getString(R.string.vi_system_error);
                                }
                                BioListActivity.access$2300(bioListActivity6, "", message);
                                BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                                return;
                            } else {
                                BioListActivity bioListActivity7 = BioListActivity.this;
                                bioListActivity7.toast(bioListActivity7.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                                BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                                return;
                            }
                        }
                    }
                    BioListActivity bioListActivity8 = BioListActivity.this;
                    bioListActivity8.toast(bioListActivity8.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                    BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                }
            });
        }
    }

    public static /* synthetic */ void access$200(BioListActivity bioListActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35786c08", new Object[]{bioListActivity, bundle});
            return;
        }
        Intent intent = new Intent(bioListActivity, BioProtoActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    public static /* synthetic */ ArrayList access$2100(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("effcf439", new Object[]{bioListActivity});
        }
        return bioListActivity.q;
    }

    public static /* synthetic */ void access$2200(BioListActivity bioListActivity, final int i, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4d11d9", new Object[]{bioListActivity, new Integer(i), str, str2});
        } else {
            bioListActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if ("open".equalsIgnoreCase(str)) {
                        if ("mBioNotOpenAdapter".equalsIgnoreCase(str2)) {
                            if (BioListActivity.access$2100(BioListActivity.this) != null && BioListActivity.access$2100(BioListActivity.this).size() > 0) {
                                int i2 = i;
                                if (i2 >= 0 && i2 < BioListActivity.access$2100(BioListActivity.this).size()) {
                                    ((BioMenuData) BioListActivity.access$2100(BioListActivity.this).get(i)).sliderStatus = str;
                                    BioListActivity.access$1800(BioListActivity.this).add(0, BioListActivity.access$2100(BioListActivity.this).get(i));
                                    BioListActivity.access$2100(BioListActivity.this).remove(i);
                                    BioListActivity.access$2702(BioListActivity.this, true);
                                }
                                BioListAdapter access$300 = BioListActivity.access$300(BioListActivity.this);
                                ArrayList access$1800 = BioListActivity.access$1800(BioListActivity.this);
                                BioListActivity bioListActivity2 = BioListActivity.this;
                                access$300.a(access$1800, BioListActivity.access$2800(bioListActivity2, BioListActivity.access$1800(bioListActivity2)));
                                BioListActivity bioListActivity3 = BioListActivity.this;
                                BioListActivity.access$2900(bioListActivity3, BioListActivity.access$1800(bioListActivity3));
                                if (BioListActivity.access$1800(BioListActivity.this).size() <= 0) {
                                    BioListActivity.access$3000(BioListActivity.this).setVisibility(8);
                                } else {
                                    BioListActivity.access$3000(BioListActivity.this).setVisibility(0);
                                }
                                BioListActivity.access$500(BioListActivity.this).a(BioListActivity.access$2100(BioListActivity.this), 0);
                                if (BioListActivity.access$2100(BioListActivity.this).size() > 0) {
                                    BioListActivity.access$3200(BioListActivity.this);
                                    BioListActivity.access$3100(BioListActivity.this).setVisibility(0);
                                }
                                BioListActivity.access$3100(BioListActivity.this).setVisibility(8);
                            } else {
                                return;
                            }
                        } else if (BioListActivity.access$1800(BioListActivity.this).size() > 0) {
                            int i3 = i;
                            if (i3 >= 0 && i3 < BioListActivity.access$1800(BioListActivity.this).size()) {
                                ((BioMenuData) BioListActivity.access$1800(BioListActivity.this).get(i)).sliderStatus = str;
                                BioListAdapter access$3002 = BioListActivity.access$300(BioListActivity.this);
                                ArrayList access$18002 = BioListActivity.access$1800(BioListActivity.this);
                                BioListActivity bioListActivity4 = BioListActivity.this;
                                access$3002.a(access$18002, BioListActivity.access$2800(bioListActivity4, BioListActivity.access$1800(bioListActivity4)));
                                BioListActivity bioListActivity5 = BioListActivity.this;
                                BioListActivity.access$2900(bioListActivity5, BioListActivity.access$1800(bioListActivity5));
                            }
                            BioListActivity.access$3000(BioListActivity.this).setVisibility(0);
                        } else {
                            BioListActivity.access$3000(BioListActivity.this).setVisibility(8);
                        }
                        BioListActivity.access$3300(BioListActivity.this);
                        BioListActivity.access$1600(BioListActivity.this);
                    } else {
                        if ("close".equalsIgnoreCase(str)) {
                            if (!"mBioListAdapter".equalsIgnoreCase(str2)) {
                                if (BioListActivity.access$2100(BioListActivity.this).size() > 0) {
                                    int i4 = i;
                                    if (i4 >= 0 && i4 < BioListActivity.access$2100(BioListActivity.this).size()) {
                                        ((BioMenuData) BioListActivity.access$2100(BioListActivity.this).get(i)).sliderStatus = str;
                                        BioListActivity.access$500(BioListActivity.this).a(BioListActivity.access$2100(BioListActivity.this), 0);
                                        BioListActivity bioListActivity6 = BioListActivity.this;
                                        BioListActivity.access$2900(bioListActivity6, BioListActivity.access$1800(bioListActivity6));
                                    }
                                    BioListActivity.access$3100(BioListActivity.this).setVisibility(0);
                                }
                                BioListActivity.access$3100(BioListActivity.this).setVisibility(8);
                            } else if (BioListActivity.access$1800(BioListActivity.this) != null && BioListActivity.access$1800(BioListActivity.this).size() > 0) {
                                int i5 = i;
                                if (i5 >= 0 && i5 < BioListActivity.access$1800(BioListActivity.this).size()) {
                                    ((BioMenuData) BioListActivity.access$1800(BioListActivity.this).get(i)).sliderStatus = str;
                                    BioListActivity.access$2100(BioListActivity.this).add(BioListActivity.access$1800(BioListActivity.this).get(i));
                                    BioListActivity.access$1800(BioListActivity.this).remove(i);
                                }
                                BioListAdapter access$3003 = BioListActivity.access$300(BioListActivity.this);
                                ArrayList access$18003 = BioListActivity.access$1800(BioListActivity.this);
                                BioListActivity bioListActivity7 = BioListActivity.this;
                                access$3003.a(access$18003, BioListActivity.access$2800(bioListActivity7, BioListActivity.access$1800(bioListActivity7)));
                                BioListActivity bioListActivity8 = BioListActivity.this;
                                BioListActivity.access$2900(bioListActivity8, BioListActivity.access$1800(bioListActivity8));
                                if (BioListActivity.access$1800(BioListActivity.this).size() <= 0) {
                                    BioListActivity.access$3000(BioListActivity.this).setVisibility(8);
                                } else {
                                    BioListActivity.access$3000(BioListActivity.this).setVisibility(0);
                                }
                                BioListActivity.access$500(BioListActivity.this).a(BioListActivity.access$2100(BioListActivity.this), 0);
                                if (BioListActivity.access$2100(BioListActivity.this).size() > 0) {
                                    BioListActivity.access$3200(BioListActivity.this);
                                    BioListActivity.access$3100(BioListActivity.this).setVisibility(0);
                                }
                                BioListActivity.access$3100(BioListActivity.this).setVisibility(8);
                            } else {
                                return;
                            }
                        }
                        BioListActivity.access$3300(BioListActivity.this);
                        BioListActivity.access$1600(BioListActivity.this);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void access$2300(BioListActivity bioListActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b103b1", new Object[]{bioListActivity, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(CommonConstant.alertTextColor, true);
        bioListActivity.alert(str, str2, bioListActivity.getResources().getString(R.string.face_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    VerifyLogCat.d(BioListActivity.access$1400(), "人脸无法识别提醒");
                }
            }
        }, (String) null, (DialogInterface.OnClickListener) null, bundle);
    }

    public static /* synthetic */ void access$2400(BioListActivity bioListActivity, final int i, String str, Bundle bundle, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade2fa6d", new Object[]{bioListActivity, new Integer(i), str, bundle, str2});
        } else {
            BioOpenHelper.doBioRpcRequest("", str, "CLOSE_BIO", bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str3, String str4, String str5, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str3, str4, str5, new Boolean(z), mICProdmngResponse});
                        return;
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("resultCode", str5);
                    BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-03", hashMap);
                    if ("1000".equalsIgnoreCase(str5)) {
                        BioListActivity bioListActivity2 = BioListActivity.this;
                        bioListActivity2.toast(bioListActivity2.getResources().getString(R.string.close_success), R.drawable.open_success, 0);
                        BioListActivity.access$2200(BioListActivity.this, i, "close", str2);
                        return;
                    }
                    if (!"1001".equalsIgnoreCase(str5)) {
                        if ("2003".equalsIgnoreCase(str5) || "RPC_EXCEPTION".equalsIgnoreCase(str5)) {
                            BioListActivity bioListActivity3 = BioListActivity.this;
                            bioListActivity3.toast(bioListActivity3.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
                            BioListActivity.access$2200(BioListActivity.this, i, "open", str2);
                            return;
                        } else if ("1004".equalsIgnoreCase(str5)) {
                            BioListActivity bioListActivity4 = BioListActivity.this;
                            bioListActivity4.toast(bioListActivity4.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                            return;
                        } else if ("1003".equalsIgnoreCase(str5)) {
                            BioListActivity.access$2200(BioListActivity.this, i, "open", str2);
                            return;
                        }
                    }
                    BioListActivity bioListActivity5 = BioListActivity.this;
                    bioListActivity5.toast(bioListActivity5.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                    BioListActivity.access$2200(BioListActivity.this, i, "open", str2);
                }
            });
        }
    }

    public static /* synthetic */ BroadcastReceiver access$2500(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("fd691992", new Object[]{bioListActivity});
        }
        return bioListActivity.H;
    }

    public static /* synthetic */ LocalBroadcastManager access$2600(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("246196a8", new Object[]{bioListActivity});
        }
        return bioListActivity.I;
    }

    public static /* synthetic */ boolean access$2702(BioListActivity bioListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91690361", new Object[]{bioListActivity, new Boolean(z)})).booleanValue();
        }
        bioListActivity.getClass();
        return z;
    }

    public static /* synthetic */ int access$2800(BioListActivity bioListActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5f0e1c", new Object[]{bioListActivity, list})).intValue();
        }
        return d(list);
    }

    public static /* synthetic */ void access$2900(BioListActivity bioListActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f41c8", new Object[]{bioListActivity, list});
        } else {
            bioListActivity.a(list);
        }
    }

    public static /* synthetic */ BioListAdapter access$300(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioListAdapter) ipChange.ipc$dispatch("e1efedf1", new Object[]{bioListActivity});
        }
        return bioListActivity.E;
    }

    public static /* synthetic */ APListView access$3000(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APListView) ipChange.ipc$dispatch("c8d943b9", new Object[]{bioListActivity});
        }
        return bioListActivity.t;
    }

    public static /* synthetic */ APListView access$3100(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (APListView) ipChange.ipc$dispatch("33ca5c3a", new Object[]{bioListActivity});
        }
        return bioListActivity.u;
    }

    public static /* synthetic */ void access$3200(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236ae9bf", new Object[]{bioListActivity});
        } else {
            bioListActivity.e();
        }
    }

    public static /* synthetic */ void access$3300(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6c3b5e", new Object[]{bioListActivity});
        } else {
            bioListActivity.f();
        }
    }

    public static /* synthetic */ void access$3400(BioListActivity bioListActivity, MICProdmngResponse mICProdmngResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f88f97", new Object[]{bioListActivity, mICProdmngResponse});
            return;
        }
        bioListActivity.dismissProgressDialog();
        if (mICProdmngResponse == null || !mICProdmngResponse.success) {
            bioListActivity.eventlogBehavior("processRpcResult", "UC-MobileIC-20200421-4", null);
            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                bioListActivity.finish();
                return;
            }
            return;
        }
        bioListActivity.eventlogBehavior("processRpcResult", "UC-MobileIC-20200421-3", null);
        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            bioListActivity.finish();
        }
    }

    public static /* synthetic */ int access$400(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b986207d", new Object[]{bioListActivity})).intValue();
        }
        return bioListActivity.D;
    }

    public static /* synthetic */ BioListAdapter access$500(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioListAdapter) ipChange.ipc$dispatch("52d92baf", new Object[]{bioListActivity});
        }
        return bioListActivity.F;
    }

    public static /* synthetic */ TextView access$600(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1cf4943c", new Object[]{bioListActivity});
        }
        return bioListActivity.x;
    }

    public static /* synthetic */ ImageView access$700(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("fba27c09", new Object[]{bioListActivity});
        }
        return bioListActivity.A;
    }

    public static /* synthetic */ String access$800(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e074ba5a", new Object[]{bioListActivity});
        }
        return bioListActivity.g;
    }

    public static /* synthetic */ void access$900(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368cb8a5", new Object[]{bioListActivity});
        } else {
            bioListActivity.b();
        }
    }

    public static /* synthetic */ Object ipc$super(BioListActivity bioListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioListActivity");
        }
    }

    public final void a(List<BioMenuData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            if (!this.j) {
                this.v.setText(this.f);
                this.v.setVisibility(0);
                this.A.setVisibility(8);
                this.x.setVisibility(8);
            } else if (d(list) > 1) {
                b();
                this.v.setVisibility(0);
                this.x.setVisibility(0);
                this.A.setVisibility(0);
                this.v.setVisibility(0);
                if (TextUtils.isEmpty(this.g)) {
                    this.g = getResources().getString(R.string.change_sort);
                }
                this.x.setText(this.g);
                this.x.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        boolean z = BioListActivity.access$300(BioListActivity.this).d;
                        if (BioListActivity.access$400(BioListActivity.this) > 2) {
                            if (BioListActivity.access$500(BioListActivity.this) != null) {
                                BioListActivity.access$500(BioListActivity.this).g = z;
                                BioListActivity.access$500(BioListActivity.this).notifyDataSetChanged();
                            }
                            BioListAdapter access$300 = BioListActivity.access$300(BioListActivity.this);
                            access$300.d = true ^ z;
                            access$300.notifyDataSetChanged();
                            if (!z) {
                                BioListActivity.access$600(BioListActivity.this).setText(BioListActivity.this.getResources().getString(R.string.sort_confirm));
                                BioListActivity.access$700(BioListActivity.this).setVisibility(8);
                                return;
                            }
                            BioListActivity.access$600(BioListActivity.this).setText(BioListActivity.access$800(BioListActivity.this));
                            BioListActivity.access$700(BioListActivity.this).setVisibility(0);
                            return;
                        }
                        BioListAdapter access$3002 = BioListActivity.access$300(BioListActivity.this);
                        access$3002.e = true;
                        access$3002.a(0, 1);
                        access$3002.notifyDataSetChanged();
                        BioListActivity.access$600(BioListActivity.this).setText(BioListActivity.access$800(BioListActivity.this));
                        BioListActivity.access$700(BioListActivity.this).setVisibility(0);
                        BioListActivity.access$900(BioListActivity.this);
                    }
                });
            } else {
                this.v.setVisibility(8);
                this.A.setVisibility(8);
                this.x.setVisibility(8);
            }
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.k) {
            this.v.setText(getResources().getString(R.string.header_tip_ing_close));
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent)) || !this.l) {
            this.v.setText(getResources().getString(R.string.header_tip_ing_close));
        } else {
            this.v.setText(getResources().getString(R.string.header_tip_ing_enable));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.t.getVisibility() == 8) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
            layoutParams.topMargin = DensityUtil.dip2px(this, 15.0f);
            this.u.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
            layoutParams2.topMargin = DensityUtil.dip2px(this, 20.0f);
            this.u.setLayoutParams(layoutParams2);
        }
    }

    public void eventlogBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e2b35c", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w("BioListActivity", "eventlogBehavior Exception", th);
                return;
            }
        }
        VerifyLogger.getInstance().eventBehavior(str2, "", "", "", hashMap);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.p != null && !TextUtils.isEmpty(this.n) && !TextUtils.isEmpty(this.m)) {
            String str = this.n + this.m;
            if (!TextUtils.isEmpty(str)) {
                this.w.setVisibility(0);
                int indexOf = str.indexOf(this.m);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf, this.m.length() + indexOf, 33);
                this.w.setText(str);
                this.w.setText(spannableStringBuilder);
                this.w.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (!TextUtils.isEmpty(BioListActivity.access$1000(BioListActivity.this)) && !BioListActivity.this.isDoubleClick()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("bicListUrl", BioListActivity.access$1000(BioListActivity.this));
                            BioListActivity.access$200(BioListActivity.this, bundle);
                        }
                    }
                });
                return;
            }
            this.w.setVisibility(8);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent)) && this.l) {
            if (this.p.size() <= 0) {
                this.B.setVisibility(8);
            } else {
                if (TextUtils.isEmpty(this.h)) {
                    if (this.k) {
                        this.h = getResources().getString(R.string.intelligent_title_open);
                    } else {
                        this.h = getResources().getString(R.string.intelligent_title_close);
                    }
                }
                if (TextUtils.isEmpty(this.i)) {
                    if (this.k) {
                        this.i = getResources().getString(R.string.intelligent_desc_open);
                    } else {
                        this.i = getResources().getString(R.string.intelligent_desc_close);
                    }
                }
                if (!this.h.endsWith(">")) {
                    this.h += " >";
                }
                this.y.setText(this.h);
                this.z.setText(this.i);
                this.B.setVisibility(0);
            }
            this.y.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    String string2;
                    String string3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (BioListActivity.access$1100(BioListActivity.this)) {
                        string = BioListActivity.this.getResources().getString(R.string.intelligent_alert_close);
                        string2 = BioListActivity.this.getResources().getString(R.string.ing_know);
                        string3 = BioListActivity.this.getResources().getString(R.string.ing_close);
                    } else {
                        string = BioListActivity.this.getResources().getString(R.string.intelligent_alert_open);
                        string2 = BioListActivity.this.getResources().getString(R.string.ing_open);
                        string3 = BioListActivity.this.getResources().getString(R.string.ing_close_ignore);
                    }
                    BioListActivity.this.alert((String) null, string, string2, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (!BioListActivity.access$1100(BioListActivity.this)) {
                                BioListActivity.access$1200(BioListActivity.this, true);
                                BioListActivity.this.eventlogBehavior("openIntelligemt", "UC-MobileIC-20200421-2", null);
                            }
                        }
                    }, string3, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (BioListActivity.access$1100(BioListActivity.this)) {
                                BioListActivity.access$1200(BioListActivity.this, false);
                                BioListActivity.this.eventlogBehavior("closeIntelligemt", "UC-MobileIC-20200421-1", null);
                            }
                        }
                    }, Boolean.FALSE);
                }
            });
        }
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.J;
        if (0 < j && j < 1000) {
            return true;
        }
        this.J = elapsedRealtime;
        return false;
    }

    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w("BioListActivity", "logBehavior Exception", th);
                return;
            }
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, "", "", null, hashMap);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        h();
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LocalBroadcastManager localBroadcastManager = this.I;
        if (localBroadcastManager != null) {
            localBroadcastManager.unregisterReceiver(this.G);
            unregisterReceiver(this.G);
            BroadcastReceiver broadcastReceiver = this.H;
            if (broadcastReceiver != null) {
                this.I.unregisterReceiver(broadcastReceiver);
            }
        }
    }

    public static /* synthetic */ void access$1500(BioListActivity bioListActivity, MICProdmngResponse mICProdmngResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a283a83a", new Object[]{bioListActivity, mICProdmngResponse, new Boolean(z)});
            return;
        }
        bioListActivity.dismissProgressDialog();
        if (mICProdmngResponse != null && mICProdmngResponse.success) {
            Map<String, String> map = mICProdmngResponse.data;
            if (map != null) {
                bioListActivity.h = map.get("intelligentTitle");
                bioListActivity.i = map.get("intelligentDesc");
            }
            if (TextUtils.isEmpty(bioListActivity.h)) {
                bioListActivity.h = "";
            }
            if (TextUtils.isEmpty(bioListActivity.i)) {
                bioListActivity.i = "";
            }
            if (z) {
                bioListActivity.k = true;
                bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_open_success), R.drawable.open_success, 0);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        BioListActivity.access$1600(BioListActivity.this);
                        if (BioListActivity.access$1700(BioListActivity.this) && BioListActivity.access$1800(BioListActivity.this).size() > 1) {
                            BioListActivity.access$900(BioListActivity.this);
                        }
                    }
                });
                return;
            }
            bioListActivity.k = false;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioListActivity.access$1600(BioListActivity.this);
                    if (BioListActivity.access$1700(BioListActivity.this) && BioListActivity.access$1800(BioListActivity.this).size() > 1) {
                        BioListActivity.access$900(BioListActivity.this);
                    }
                }
            });
            bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_close_success), R.drawable.open_success, 0);
        } else if (z) {
            bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_open_fail), R.drawable.warning, 0);
        } else {
            bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_close_fail), R.drawable.warning, 0);
        }
    }

    public static int d(List<BioMenuData> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{list})).intValue();
        }
        for (BioMenuData bioMenuData : list) {
            if ("open".equalsIgnoreCase(bioMenuData.sliderStatus)) {
                i++;
            }
        }
        return i;
    }

    public final void c(String str) {
        MenuGroup menuGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                BioPageData bioPageData = (BioPageData) JSON.parseObject(str, BioPageData.class);
                this.P = bioPageData.title;
                this.Q = bioPageData.helpUrl;
                this.s = bioPageData.protocol;
                this.N.getString("biolistintroducetxt");
                this.N.getString("biolistintrodicturl");
                if (!str.contains("intelligentEnable")) {
                    this.l = false;
                    this.k = true;
                } else {
                    this.l = false;
                    this.k = bioPageData.intelligentEnable;
                }
                this.h = bioPageData.intelligentTitle;
                this.i = bioPageData.intelligentDesc;
                Map<String, String> map = this.s;
                if (map != null) {
                    this.m = map.get("GeneralProtocol");
                    this.n = this.s.get("GeneralPrefix");
                    this.o = this.s.get("GeneralUrl");
                }
                List<MenuGroup> list = bioPageData.menuGroup;
                if (list != null && (menuGroup = list.get(0)) != null) {
                    this.f = menuGroup.tip;
                    this.j = menuGroup.enableSort;
                    this.g = menuGroup.sortDesc;
                    ArrayList<BioMenuData> arrayList = menuGroup.menus;
                    if (arrayList != null) {
                        this.D = arrayList.size();
                        Iterator<BioMenuData> it = menuGroup.menus.iterator();
                        while (it.hasNext()) {
                            BioMenuData next = it.next();
                            if ("open".equalsIgnoreCase(next.sliderStatus)) {
                                this.C++;
                                this.p.add(next);
                            } else {
                                this.q.add(next);
                            }
                        }
                        VerifyLogCat.i("BioListActivity", "bioMenuData.size:" + this.p.size());
                        VerifyLogCat.i("BioListActivity", "bioNotOpenData.size:" + this.q.size());
                    }
                }
            } catch (Exception e) {
                VerifyLogCat.d("BioListActivity", "解析失败" + e.getMessage());
            }
        }
    }

    public final void h() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        BioListAdapter bioListAdapter = this.E;
        if (bioListAdapter != null) {
            if (bioListAdapter.getCount() != this.C) {
                z = true;
            }
            if (!this.r.toString().equals(this.p.toString()) || z) {
                final List<BioMenuData> list = this.E.f4349a;
                AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            String str = "";
                            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                                BioListActivity.this.showProgressDialog(str, false, null);
                            }
                            MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                            mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                            mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                            mICProdmngRequest.action = "changesort";
                            mICProdmngRequest.params = new HashMap();
                            StringBuilder sb = new StringBuilder();
                            if (list.size() > 0) {
                                for (BioMenuData bioMenuData : list) {
                                    sb.append(bioMenuData.productId);
                                    sb.append(",");
                                }
                                String sb2 = sb.toString();
                                str = sb2.substring(0, sb2.length() - 1);
                            }
                            if (BioListActivity.access$1300(BioListActivity.this) != null) {
                                mICProdmngRequest.params.put("tbsid", BioListActivity.access$1300(BioListActivity.this).getString("tbsid"));
                            }
                            mICProdmngRequest.params.put("sortlist", str);
                            BioListActivity.access$3400(BioListActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest));
                        } catch (RpcException unused) {
                            BioListActivity.this.dismissProgressDialog();
                            BioListActivity.access$3400(BioListActivity.this, null);
                            VerifyLogCat.e(BioListActivity.access$1400(), "RpcException");
                        }
                    }
                }, "sendSortRpc");
                return;
            }
        }
        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            finish();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.bio_product_list);
        this.t = (APListView) findViewById(R.id.bio_product_list);
        this.u = (APListView) findViewById(R.id.bio_unable_list);
        this.w = (TextView) findViewById(R.id.tv_protocol_bio);
        this.B = (RelativeLayout) findViewById(R.id.ing_titlelayout);
        this.y = (TextView) findViewById(R.id.ing_title);
        this.z = (TextView) findViewById(R.id.ing_desc);
        this.p = new ArrayList<>();
        this.q = new ArrayList<>();
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.N = extras;
            if (extras != null) {
                this.O = extras.getString("bioListData");
                this.K = this.N.getBundle("initParams");
                c(this.O);
            }
        }
        this.r.addAll(this.p);
        boolean isEmpty = TextUtils.isEmpty(this.Q);
        TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
        titleBarAdapter.a(this, this.P, true ^ isEmpty);
        titleBarAdapter.f4342a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                BioListActivity.access$000(BioListActivity.this);
                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                    BioListActivity.this.finish();
                }
            }
        };
        if (!isEmpty) {
            titleBarAdapter.b = new TitleBarAdapter.OnRightButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnRightButtonClickListener
                public final void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (!TextUtils.isEmpty(BioListActivity.access$100(BioListActivity.this))) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("bicListUrl", BioListActivity.access$100(BioListActivity.this));
                        BioListActivity.access$200(BioListActivity.this, bundle2);
                    }
                }
            };
        }
        View inflate = View.inflate(this, R.layout.bio_list_header, null);
        this.v = (TextView) inflate.findViewById(R.id.tv_header_tip);
        this.x = (TextView) inflate.findViewById(R.id.changesort);
        this.A = (ImageView) inflate.findViewById(R.id.icon_sort);
        this.t.addHeaderView(inflate);
        BioListAdapter bioListAdapter = new BioListAdapter(this, this.p);
        this.E = bioListAdapter;
        this.t.setAdapter((ListAdapter) bioListAdapter);
        BioListAdapter bioListAdapter2 = this.E;
        bioListAdapter2.f = this.j;
        ArrayList<BioMenuData> arrayList = this.p;
        bioListAdapter2.a(arrayList, d(arrayList));
        a(this.p);
        if (this.p.size() <= 0) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
        }
        f();
        g();
        BioListAdapter bioListAdapter3 = new BioListAdapter(this, this.q);
        this.F = bioListAdapter3;
        this.u.setAdapter((ListAdapter) bioListAdapter3);
        this.F.a(this.q, 0);
        if (this.q.size() <= 0) {
            this.u.setVisibility(8);
        } else {
            e();
            this.u.setVisibility(0);
        }
        this.G = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioListActivity$13");
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) || "android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                    BioListAdapter access$300 = BioListActivity.access$300(BioListActivity.this);
                    ArrayList access$1800 = BioListActivity.access$1800(BioListActivity.this);
                    BioListActivity bioListActivity = BioListActivity.this;
                    access$300.a(access$1800, BioListActivity.access$2800(bioListActivity, BioListActivity.access$1800(bioListActivity)));
                    BioListActivity.access$500(BioListActivity.this).a(BioListActivity.access$2100(BioListActivity.this), 0);
                }
            }
        };
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        this.I = instance;
        instance.registerReceiver(this.G, new IntentFilter(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT));
        registerReceiver(this.G, new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.E.b = new BioListAdapter.OnProdItemClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnProdItemClickListener
            public final void a(int i, boolean z) {
                BioMenuData bioMenuData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
                } else if (BioListActivity.access$1800(BioListActivity.this) != null && i >= 0 && i <= BioListActivity.access$1800(BioListActivity.this).size() - 1 && (bioMenuData = (BioMenuData) BioListActivity.access$1800(BioListActivity.this).get(i)) != null) {
                    String str = bioMenuData.module;
                    Bundle bundle2 = new Bundle();
                    Map<String, String> map = bioMenuData.extInfo;
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            bundle2.putString(str2, bioMenuData.extInfo.get(str2));
                        }
                    }
                    if (BioListActivity.access$1300(BioListActivity.this) != null) {
                        bundle2.putString("tbsid", BioListActivity.access$1300(BioListActivity.this).getString("tbsid"));
                    }
                    bundle2.putString(upx.PRODUCT_ID, bioMenuData.productId);
                    bundle2.putString("sceneId", bioMenuData.sceneId);
                    bundle2.putString("module", str);
                    bundle2.putString("forbidUI", "true");
                    bundle2.putString(yj4.PARAM_PRODUCT_TYPE, bioMenuData.productType);
                    bundle2.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    bundle2.putString("secData", EnvInfoUtil.getFpSecdata());
                    if (z) {
                        if ("close".equals(bioMenuData.sliderStatus)) {
                            BioListActivity.this.logBehavior("bioclose", "UC-MobileIC-190528-02", null);
                            BioListActivity.access$1900(BioListActivity.this, i, str, bundle2, "mBioListAdapter");
                        }
                    } else if ("open".equals(bioMenuData.sliderStatus)) {
                        BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-01", null);
                        BioListActivity.access$2000(BioListActivity.this, i, str, bioMenuData.productId, bundle2, "mBioListAdapter");
                    }
                }
            }
        };
        this.E.c = new BioListAdapter.OnSwitchListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnSwitchListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BioListActivity.access$900(BioListActivity.this);
                }
            }
        };
        this.F.b = new BioListAdapter.OnProdItemClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnProdItemClickListener
            public final void a(int i, boolean z) {
                BioMenuData bioMenuData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
                } else if (BioListActivity.access$2100(BioListActivity.this) != null && i >= 0 && i <= BioListActivity.access$2100(BioListActivity.this).size() - 1 && (bioMenuData = (BioMenuData) BioListActivity.access$2100(BioListActivity.this).get(i)) != null) {
                    String str = bioMenuData.module;
                    Bundle bundle2 = new Bundle();
                    Map<String, String> map = bioMenuData.extInfo;
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            bundle2.putString(str2, bioMenuData.extInfo.get(str2));
                        }
                    }
                    if (BioListActivity.access$1300(BioListActivity.this) != null) {
                        bundle2.putString("tbsid", BioListActivity.access$1300(BioListActivity.this).getString("tbsid"));
                    }
                    bundle2.putString(upx.PRODUCT_ID, bioMenuData.productId);
                    bundle2.putString("sceneId", bioMenuData.sceneId);
                    bundle2.putString("module", str);
                    bundle2.putString("forbidUI", "true");
                    bundle2.putString(yj4.PARAM_PRODUCT_TYPE, bioMenuData.productType);
                    bundle2.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    bundle2.putString("secData", EnvInfoUtil.getFpSecdata());
                    if (z) {
                        if ("close".equals(bioMenuData.sliderStatus)) {
                            BioListActivity.this.logBehavior("bioclose", "UC-MobileIC-190528-02", null);
                            BioListActivity.access$1900(BioListActivity.this, i, str, bundle2, "mBioNotOpenAdapter");
                        }
                    } else if ("open".equals(bioMenuData.sliderStatus)) {
                        BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-01", null);
                        BioListActivity.access$2000(BioListActivity.this, i, str, bioMenuData.productId, bundle2, "mBioNotOpenAdapter");
                    }
                }
            }
        };
    }

    public static /* synthetic */ void access$2000(BioListActivity bioListActivity, final int i, final String str, String str2, final Bundle bundle, final String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c795a7", new Object[]{bioListActivity, new Integer(i), str, str2, bundle, str3});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(CommonConstant.alertTextColor, true);
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(str2)) {
            str4 = bioListActivity.getResources().getString(R.string.finger_closed_dialog_title);
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(str2)) {
            str4 = bioListActivity.getResources().getString(R.string.face_closed_dialog_title);
        } else if (!CommonConstant.FACE_PAY.equalsIgnoreCase(str2)) {
            str4 = null;
        } else if (VIUtils.isInExport()) {
            str4 = bioListActivity.getResources().getString(R.string.face_2D_closed_title);
        } else {
            VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20190923-01", "", "", "", new HashMap());
            ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{"https://render.alipay.com/p/c/jygb47sq"});
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str5, Object... objArr) {
                    str5.hashCode();
                    int hashCode = str5.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioListActivity$7");
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if ("VI_ACTION_BIO_CLOSE_RESULT".equalsIgnoreCase(intent.getAction())) {
                        intent.getStringExtra("type");
                        boolean booleanExtra = intent.getBooleanExtra("close", false);
                        HashMap hashMap = new HashMap();
                        if (booleanExtra) {
                            BioListActivity.access$2400(BioListActivity.this, i, str, bundle, "mBioListAdapter");
                            hashMap.put("action", "close");
                        } else {
                            BioListActivity.access$2200(BioListActivity.this, i, "open", "mBioListAdapter");
                            hashMap.put("action", "cancel");
                        }
                        VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20190923-02", "", "", "", hashMap);
                        BioListActivity.access$2600(BioListActivity.this).unregisterReceiver(BioListActivity.access$2500(BioListActivity.this));
                    }
                }
            };
            bioListActivity.H = broadcastReceiver;
            bioListActivity.I.registerReceiver(broadcastReceiver, new IntentFilter("VI_ACTION_BIO_CLOSE_RESULT"));
            return;
        }
        bioListActivity.alert("", str4, bioListActivity.getResources().getString(R.string.finger_closed_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    BioListActivity.access$2400(BioListActivity.this, i, str, bundle, str3);
                }
            }
        }, bioListActivity.getResources().getString(R.string.finger_closed_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    BioListActivity.access$2200(BioListActivity.this, i, "open", str3);
                }
            }
        }, bundle2);
    }
}
