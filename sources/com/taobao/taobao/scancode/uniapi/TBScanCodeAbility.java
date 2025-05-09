package com.taobao.taobao.scancode.uniapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsScanCodeAbility;
import com.taobao.android.abilityidl.ability.ScanCodeResult;
import com.taobao.android.abilityidl.ability.ScanCodeSuccessResult;
import com.taobao.android.nav.Nav;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.Scancode;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import tb.kdb;
import tb.mmd;
import tb.t2o;
import tb.yro;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBScanCodeAbility extends AbsScanCodeAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IS_NATIVE_ALBUM_SHOW = "isNativeAlbumShow";
    public static final String KEY_SCAN_ONLY = "scanOnly";
    private static final String SCANCODE_GATEWAY_URL = "https://m.taobao.com/scan_imagesearch";
    private static final String TAG = "TBScanCodeAbility";
    private Context mAppContext;
    private HashSet<BroadcastReceiver> mReceiverSet = new HashSet<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Scancode.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12949a;
        public final /* synthetic */ mmd b;

        public a(TBScanCodeAbility tBScanCodeAbility, String str, mmd mmdVar) {
            this.f12949a = str;
            this.b = mmdVar;
        }

        @Override // com.taobao.android.scancode.common.util.Scancode.a
        public void a(ScancodeResult scancodeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f59040", new Object[]{this, scancodeResult});
                return;
            }
            String str = scancodeResult.code;
            Objects.toString(scancodeResult.type);
            ScanCodeSuccessResult scanCodeSuccessResult = new ScanCodeSuccessResult();
            scanCodeSuccessResult.results = new ArrayList();
            ScanCodeResult scanCodeResult = new ScanCodeResult();
            scanCodeResult.code = scancodeResult.code;
            scanCodeResult.type = this.f12949a;
            scanCodeSuccessResult.results.add(scanCodeResult);
            this.b.i1(scanCodeSuccessResult);
        }
    }

    static {
        t2o.a(760217776);
    }

    public static /* synthetic */ HashSet access$000(TBScanCodeAbility tBScanCodeAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("5215fe63", new Object[]{tBScanCodeAbility});
        }
        return tBScanCodeAbility.mReceiverSet;
    }

    private String addCallbackReceiver(final Context context, final Scancode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7d5a64c", new Object[]{this, context, aVar});
        }
        if (aVar == null) {
            return null;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.taobao.scancode.uniapi.TBScanCodeAbility.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/uniapi/TBScanCodeAbility$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                Serializable serializableExtra = intent.getSerializableExtra(Scancode.GATEWAY_CALLBACK_RESULT_PARAM);
                Objects.toString(serializableExtra);
                if (serializableExtra instanceof ScancodeResult) {
                    aVar.a((ScancodeResult) serializableExtra);
                }
                context.unregisterReceiver(this);
                TBScanCodeAbility.access$000(TBScanCodeAbility.this).remove(this);
            }
        };
        String uuid = UUID.randomUUID().toString();
        context.registerReceiver(broadcastReceiver, new IntentFilter(uuid));
        this.mReceiverSet.add(broadcastReceiver);
        return uuid;
    }

    private HashSet<ScancodeType> getExpectScanTypeList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("c7960cf2", new Object[]{this, str});
        }
        HashSet<ScancodeType> hashSet = new HashSet<>();
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals("QRCODE")) {
                hashSet.add(ScancodeType.QR);
            } else if (!str.equals("BARCODE")) {
                initDefaultScanTypeSet(hashSet);
            } else {
                hashSet.add(ScancodeType.MEDICINE);
                hashSet.add(ScancodeType.PRODUCT);
                hashSet.add(ScancodeType.EXPRESS);
            }
        } else {
            initDefaultScanTypeSet(hashSet);
        }
        new StringBuilder("type=").append(str);
        Iterator<ScancodeType> it = hashSet.iterator();
        while (it.hasNext()) {
            new StringBuilder("scancodeType=").append(it.next());
        }
        return hashSet;
    }

    private void initDefaultScanTypeSet(HashSet<ScancodeType> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e40d20c", new Object[]{this, hashSet});
            return;
        }
        hashSet.add(ScancodeType.QR);
        hashSet.add(ScancodeType.MEDICINE);
        hashSet.add(ScancodeType.PRODUCT);
        hashSet.add(ScancodeType.EXPRESS);
        hashSet.add(ScancodeType.GEN3);
        hashSet.add(ScancodeType.TB_4G);
    }

    public static /* synthetic */ Object ipc$super(TBScanCodeAbility tBScanCodeAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/uniapi/TBScanCodeAbility");
    }

    private void jumpToScanPage(Context context, Scancode.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada8069e", new Object[]{this, context, aVar, str});
            return;
        }
        String addCallbackReceiver = addCallbackReceiver(context, aVar);
        Bundle bundle = new Bundle();
        bundle.putString(Scancode.GATEWAY_CALLBACK_ACTION_PARAM, addCallbackReceiver);
        Uri.Builder buildUpon = Uri.parse(SCANCODE_GATEWAY_URL).buildUpon();
        buildUpon.appendQueryParameter("fromScan", "true");
        buildUpon.appendQueryParameter("scanOnly", "true");
        buildUpon.appendQueryParameter("pssource", str);
        buildUpon.appendQueryParameter("_pssource", str);
        String uri = buildUpon.build().toString();
        new StringBuilder("url=").append(uri);
        Nav.from(context).withExtras(bundle).toUri(uri);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Iterator<BroadcastReceiver> it = this.mReceiverSet.iterator();
        while (it.hasNext()) {
            BroadcastReceiver next = it.next();
            Context context = this.mAppContext;
            if (context != null) {
                context.unregisterReceiver(next);
            }
        }
        this.mReceiverSet.clear();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsScanCodeAbility
    public void scan(kdb kdbVar, yro yroVar, mmd mmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f804df63", new Object[]{this, kdbVar, yroVar, mmdVar});
            return;
        }
        String str = yroVar.f32306a;
        String str2 = yroVar.b;
        if (TextUtils.isEmpty(str)) {
            mmdVar.O(new ErrorResult("params invalid"));
            return;
        }
        if (this.mAppContext == null) {
            this.mAppContext = Globals.getApplication();
        }
        jumpToScanPage(this.mAppContext, new a(this, str2, mmdVar), str);
    }
}
