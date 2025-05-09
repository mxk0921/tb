package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ImagePopTask;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class w63 extends mz1<t73> implements ImagePopTask.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CapturePresenterV2";
    public yr3 c;
    public CaptureManager d;
    public volatile DynCaptureImgGotConfig e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857514);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(730857513);
        t2o.a(481296398);
    }

    public static /* synthetic */ Object ipc$super(w63 w63Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.q();
            return null;
        } else if (hashCode == 1264052993) {
            super.r((Intent) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/CapturePresenterV2");
        }
    }

    public final yr3 C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr3) ipChange.ipc$dispatch("3151377a", new Object[]{this});
        }
        yr3 yr3Var = this.c;
        if (yr3Var == null) {
            yr3Var = yr3.parseFromIntent(((t73) this.f24401a).I().getIntent());
            if (!CaptureManager.b0 && TextUtils.isEmpty(yr3Var.getPssource())) {
                yr3Var.setPssource("sy_hwtab");
            }
            this.c = yr3Var;
            ckf.f(yr3Var, "this");
        }
        return yr3Var;
    }

    public final void D(DynCaptureImgGotConfig dynCaptureImgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc98940", new Object[]{this, dynCaptureImgGotConfig});
            return;
        }
        ckf.g(dynCaptureImgGotConfig, "imgGotConfig");
        jzu.g(p73.f25916a, "clickLibrary", "pssource", C().getPssource());
        this.e = dynCaptureImgGotConfig;
        fk0 fk0Var = new fk0(((t73) this.f24401a).p());
        Map<String, String> extraParams = fk0Var.getExtraParams();
        ckf.f(extraParams, "model.extraParams");
        extraParams.put("album_tab_type", String.valueOf(((t73) this.f24401a).m().t()));
        Map<String, String> extraParams2 = fk0Var.getExtraParams();
        ckf.f(extraParams2, "model.extraParams");
        extraParams2.put("direct_jump_after_album_choose", "true");
        if (dynCaptureImgGotConfig.g()) {
            fk0Var.setShowVideo();
        }
        ((t73) this.f24401a).I().startActivityForResult(fk0Var.createJumpIntent(), t73.Companion.a());
        ((t73) this.f24401a).I().overridePendingTransition(R.anim.album_enter_anim, R.anim.empty);
    }

    @Override // com.etao.feimagesearch.ImagePopTask.b
    public void J(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fa97cd", new Object[]{this, str, new Boolean(z), map});
        }
    }

    @Override // com.etao.feimagesearch.ImagePopTask.a
    public void p2(List<AlbumMediaItem> list, List<kv9> list2) {
        long j;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce38034", new Object[]{this, list, list2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        if (list2 != null && list2.size() >= 4) {
            for (kv9 kv9Var : list2) {
                kv9Var.getClass();
                arrayList.add(new MusOuterAlbumBean(null, Float.valueOf(0.0f), true, Integer.valueOf(i), "false", -1L));
                i++;
            }
            jzu.q(p73.f25916a, "OuterAlbumRemote", "count", String.valueOf(arrayList.size()));
        } else if (list != null) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            boolean z = false;
            for (AlbumMediaItem albumMediaItem : list) {
                int i2 = i + 1;
                if (albumMediaItem.imgUri != null) {
                    long d = trl.d(albumMediaItem.lastUpdateTime, 0L);
                    if (Math.abs(currentTimeMillis - d) < y().y()) {
                        j = currentTimeMillis;
                        arrayList.add(new MusOuterAlbumBean(albumMediaItem.imgUri.toString(), Float.valueOf(trl.b(albumMediaItem.orientation, f)), false, Integer.valueOf(i), String.valueOf(z7n.k(albumMediaItem.imgFilePath)), Long.valueOf(d * 1000)));
                    } else {
                        j = currentTimeMillis;
                    }
                    if (!z) {
                        lk0.c(albumMediaItem.lastUpdateTime);
                        i = i2;
                        currentTimeMillis = j;
                        f = 0.0f;
                        z = true;
                    }
                } else {
                    j = currentTimeMillis;
                }
                i = i2;
                currentTimeMillis = j;
                f = 0.0f;
            }
            if (arrayList.size() > 0) {
                jzu.q(p73.f25916a, "OuterAlbumLocal", "count", String.valueOf(arrayList.size()));
            }
        }
        ((t73) this.f24401a).H0(arrayList);
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.q();
        CaptureManager captureManager = this.d;
        if (captureManager != null) {
            captureManager.Y();
        }
    }

    public final CaptureManager y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("fbe80eb4", new Object[]{this});
        }
        CaptureManager captureManager = this.d;
        if (captureManager != null) {
            return captureManager;
        }
        CaptureManager captureManager2 = new CaptureManager();
        this.d = captureManager2;
        return captureManager2;
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6fb75c", new Object[]{this, str});
            return;
        }
        ckf.g(str, "sceneType");
        int hashCode = str.hashCode();
        if (hashCode != 3524221) {
            if (hashCode != 90227986) {
                if (hashCode != 1052832078 || !str.equals("translate")) {
                    return;
                }
            } else if (!str.equals(l53.b.SCENE_AUTO_DETECT)) {
                return;
            }
        } else if (!str.equals("scan")) {
            return;
        }
        if (!this.f) {
            G();
            this.f = true;
        }
    }

    public final void F(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i2 == -1 && i == t73.Companion.a() && intent != null && !intent.getBooleanExtra("isVideo", false)) {
            Uri data = intent.getData();
            DynCaptureImgGotConfig dynCaptureImgGotConfig = this.e;
            if (dynCaptureImgGotConfig != null && dynCaptureImgGotConfig.f() != null && dynCaptureImgGotConfig.e() != null) {
                dynCaptureImgGotConfig.f().f().G(data);
                w7m f = dynCaptureImgGotConfig.f().f();
                Map<String, String> extraParams = ((t73) this.f24401a).p().getExtraParams();
                ckf.f(extraParams, "view.pageModel.extraParams");
                f.H(kotlin.collections.a.t(extraParams));
                new f48(dynCaptureImgGotConfig).a();
            }
        }
    }

    @Override // tb.mz1
    public void r(Intent intent) {
        String str;
        yr3 yr3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        super.r(intent);
        yr3 parseFromIntent = yr3.parseFromIntent(((t73) this.f24401a).I().getIntent());
        this.c = parseFromIntent;
        if (!CaptureManager.b0) {
            if (TextUtils.isEmpty(parseFromIntent == null ? null : parseFromIntent.getPssource()) && (yr3Var = this.c) != null) {
                yr3Var.setPssource("sy_hwtab");
            }
        }
        ((t73) this.f24401a).i0(new zso(C().getInitScene(), null), true);
        Uri data = intent.getData();
        String str2 = "";
        if (data != null) {
            agh.h(TAG, ckf.p("onNewIntent: ", data));
            if (TextUtils.isEmpty(data.getQueryParameter("scene"))) {
                str = data.buildUpon().appendQueryParameter("scene", C().getInitScene()).build().toString();
            } else {
                str = data.toString();
            }
            if (str != null) {
                str2 = str;
            }
        }
        ((t73) this.f24401a).m().B().t(new vol(str2));
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cfefff", new Object[]{this});
        } else if (y().f()) {
            String pssource = ((t73) this.f24401a).p().getPssource();
            String l = y().l();
            if (!TextUtils.isEmpty(l)) {
                ckf.f(l, KeepModel.STRATEGY_BLACK_LIST);
                ckf.f(pssource, "pssource");
                if (wsq.O(l, pssource, false, 2, null)) {
                    return;
                }
            }
            if (!u7m.d(((t73) this.f24401a).I())) {
                TLogTracker.h(pzl.MONITOR_PERMISSION_REQUEST, "album permission denied");
                y().B().t(new hk0(false));
                return;
            }
            agh.h(TAG, "updateRecentAlbumImg----");
            new ImagePopTask(this, 10, true).execute();
        }
    }
}
