package com.taobao.android.tucaoba;

import android.app.Application;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tucaoba.TuCaoBaDataUpload;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bpe;
import tb.mzd;
import tb.ndt;
import tb.ozd;
import tb.r59;
import tb.t2o;
import tb.uov;
import tb.w59;
import tb.xg4;
import tb.z6e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TuCaoBaDataUpload {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Application c;
    public CountDownLatch e;
    public String f;
    public Long g;

    /* renamed from: a  reason: collision with root package name */
    public final long f9717a = System.currentTimeMillis();
    public long b = 0;
    public final ArrayList<String> d = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9718a;

        public a(String str) {
            this.f9718a = str;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            }
        }

        @Override // tb.mzd
        public void onPause(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onProgress(z6e z6eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            }
        }

        @Override // tb.mzd
        public void onResume(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onStart(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
                return;
            }
            TuCaoBaDataUpload.g(TuCaoBaDataUpload.this).add(ozdVar.a());
            TuCaoBaDataUpload.h(TuCaoBaDataUpload.this).countDown();
            if (TuCaoBaDataUpload.h(TuCaoBaDataUpload.this).getCount() == 0) {
                TuCaoBaDataUpload.i(TuCaoBaDataUpload.this);
            }
            bpe.d(this.f9718a);
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            }
        }
    }

    static {
        t2o.a(913309701);
    }

    public TuCaoBaDataUpload(Application application) {
        this.c = application;
    }

    public static /* synthetic */ long b(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd82a253", new Object[]{tuCaoBaDataUpload})).longValue();
        }
        return tuCaoBaDataUpload.b;
    }

    public static /* synthetic */ void c(TuCaoBaDataUpload tuCaoBaDataUpload, String str, Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58476534", new Object[]{tuCaoBaDataUpload, str, d});
        } else {
            tuCaoBaDataUpload.o(str, d);
        }
    }

    public static /* synthetic */ Long d(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("12686594", new Object[]{tuCaoBaDataUpload});
        }
        return tuCaoBaDataUpload.g;
    }

    public static /* synthetic */ void e(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8532b6e2", new Object[]{tuCaoBaDataUpload});
        } else {
            tuCaoBaDataUpload.n();
        }
    }

    public static /* synthetic */ void f(TuCaoBaDataUpload tuCaoBaDataUpload, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382367f7", new Object[]{tuCaoBaDataUpload, str, str2});
        } else {
            tuCaoBaDataUpload.j(str, str2);
        }
    }

    public static /* synthetic */ ArrayList g(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("51c723be", new Object[]{tuCaoBaDataUpload});
        }
        return tuCaoBaDataUpload.d;
    }

    public static /* synthetic */ CountDownLatch h(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("9d848fcb", new Object[]{tuCaoBaDataUpload});
        }
        return tuCaoBaDataUpload.e;
    }

    public static /* synthetic */ void i(TuCaoBaDataUpload tuCaoBaDataUpload) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1d7ce6", new Object[]{tuCaoBaDataUpload});
        } else {
            tuCaoBaDataUpload.p();
        }
    }

    public final void j(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd80488", new Object[]{this, str, str2});
        } else {
            new Thread(new Runnable() { // from class: tb.epu
                @Override // java.lang.Runnable
                public final void run() {
                    TuCaoBaDataUpload.this.m(str2, str);
                }
            }, "TuCaoBaTLogUploadThread").start();
        }
    }

    public ArrayList<String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("94e3f628", new Object[]{this, str});
        }
        String[] split = str.substring(1, str.length() - 1).split(", ");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, split);
        return arrayList;
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4ecd01", new Object[]{this, str});
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public final void o(String str, Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90c5406", new Object[]{this, str, d});
            return;
        }
        AppMonitor.register("TuCaoBaNativeUploadFeedbackData", str, MeasureSet.create().addMeasure("totalTime"));
        AppMonitor.Stat.commit("TuCaoBaNativeUploadFeedbackData", str, (DimensionValueSet) null, MeasureValueSet.create().setValue("totalTime", d.doubleValue()));
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[]{this});
            return;
        }
        try {
            JSONObject h = uov.INSTANCE.h(this.f);
            if (h != null) {
                if (this.d.size() > 0) {
                    h.put("imageAddrs", (Object) JSON.toJSONString(this.d));
                }
                String string = h.getString("content");
                String jSONString = JSON.toJSONString(h);
                this.f = jSONString;
                q(jSONString, string);
            }
        } catch (Exception e) {
            TLog.loge(uov.INSTANCE.b(), "upload error: ", e.toString());
        }
    }

    public final void q(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc2ac0e", new Object[]{this, str, str2});
            return;
        }
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.tucaoba.TuCaoBaDataUpload.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_failed_counter", 1.0d);
                TuCaoBaDataUpload.c(TuCaoBaDataUpload.this, "tucaoba_data_upload_offline_error_time", Double.valueOf(System.currentTimeMillis() - TuCaoBaDataUpload.b(TuCaoBaDataUpload.this)));
                String b = uov.INSTANCE.b();
                TLog.loge(b, "TuCaoBaUpload", "Mtop onError: " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_success_counter", 1.0d);
                TuCaoBaDataUpload.c(TuCaoBaDataUpload.this, "tucaoba_data_upload_offline_success_time", Double.valueOf(System.currentTimeMillis() - TuCaoBaDataUpload.b(TuCaoBaDataUpload.this)));
                TuCaoBaDataUpload.c(TuCaoBaDataUpload.this, "feedback_offline_upload_gap", Double.valueOf(System.currentTimeMillis() - TuCaoBaDataUpload.d(TuCaoBaDataUpload.this).longValue()));
                JSONObject parseObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                if (parseObject.containsKey("isSuccess")) {
                    String str4 = (String) parseObject.get("isSuccess");
                    if (str4 == null || !str4.equals("false")) {
                        TuCaoBaDataUpload.e(TuCaoBaDataUpload.this);
                        if (parseObject.containsKey("feedbackId")) {
                            str3 = (String) parseObject.get("feedbackId");
                        } else {
                            str3 = "";
                        }
                        if (str3 != null && !str3.equals("")) {
                            TuCaoBaDataUpload.f(TuCaoBaDataUpload.this, str2, str3);
                            return;
                        }
                        return;
                    }
                    String b = uov.INSTANCE.b();
                    TLog.loge(b, "TuCaoBaUpload", "Mtop onError: " + ((String) parseObject.get("msg")));
                    return;
                }
                String b2 = uov.INSTANCE.b();
                TLog.loge(b2, "TuCaoBaUpload", "Mtop onError: " + mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_failed_counter", 1.0d);
                TuCaoBaDataUpload.c(TuCaoBaDataUpload.this, "tucaoba_data_upload_offline_system_error_time", Double.valueOf(System.currentTimeMillis() - TuCaoBaDataUpload.b(TuCaoBaDataUpload.this)));
                String b = uov.INSTANCE.b();
                TLog.loge(b, "TuCaoBaUpload", "Mtop onSystemError: " + mtopResponse);
            }
        };
        this.b = System.currentTimeMillis();
        w59.a(str, iRemoteBaseListener);
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b4beeb", new Object[]{this, str});
            return;
        }
        String f = bpe.f(this.c.getApplicationContext(), str);
        bpe.i(str, f, new a(f));
    }

    public final /* synthetic */ void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d95a337", new Object[]{this, str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        new r59().a(this.c.getApplicationContext(), this.g.longValue() - xg4.DEFAULT_SMALL_MAX_AGE, this.g.longValue(), str, str2, str2);
        o("tucaoba_tlog_upload_offline_time", Double.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0293e7a", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.c.getApplicationContext().getSharedPreferences("tucaoba", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("feedbackContent");
        String string = sharedPreferences.getString("feedbackImages", null);
        if (string != null) {
            ArrayList<String> k = k(string);
            this.e = new CountDownLatch(k.size());
            for (int i = 0; i < k.size(); i++) {
                l(k.get(i));
            }
        }
        edit.remove("feedbackImages");
        edit.apply();
        o("tucaoba_data_upload_offline_time", Double.valueOf(System.currentTimeMillis() - this.f9717a));
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8609b9f7", new Object[]{this});
            return;
        }
        try {
            if (uov.INSTANCE.f(this.c.getApplicationContext())) {
                SharedPreferences sharedPreferences = this.c.getApplicationContext().getSharedPreferences("tucaoba", 0);
                String string = sharedPreferences.getString("feedbackContent", null);
                this.f = string;
                if (string != null) {
                    JSONObject parseObject = JSON.parseObject(string);
                    if (parseObject != null && parseObject.containsKey(OConstant.DIMEN_COMMIT_TIME)) {
                        this.g = Long.valueOf(parseObject.getLongValue(OConstant.DIMEN_COMMIT_TIME));
                        AppMonitor.Counter.commit("TuCaoBaNativeUploadFeedbackData", "tucaoba_data_upload_offline_counter", 1.0d);
                        String string2 = sharedPreferences.getString("feedbackImages", null);
                        if (string2 != null) {
                            ArrayList<String> k = k(string2);
                            this.e = new CountDownLatch(k.size());
                            for (int i = 0; i < k.size(); i++) {
                                String str = k.get(i);
                                if (!str.startsWith("http")) {
                                    s(str);
                                } else {
                                    this.e.countDown();
                                    this.d.add(str);
                                }
                            }
                            if (this.e.getCount() == 0) {
                                p();
                                return;
                            }
                            return;
                        }
                        p();
                        return;
                    }
                    n();
                }
            }
        } catch (Exception e) {
            TLog.loge(uov.INSTANCE.b(), "uploadFeedbackData", e.toString());
            n();
        }
    }
}
