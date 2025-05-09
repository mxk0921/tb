package com.taobao.android.scancode.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.scancode.common.object.ScancodeResult;
import com.taobao.android.scancode.common.object.ScancodeType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Scancode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_CALLBACK_ACTION_PARAM = "callback_action";
    public static final String GATEWAY_CALLBACK_JSON_PARAM = "json_string";
    public static final String GATEWAY_CALLBACK_RESULT_PARAM = "callback_result";
    public static final String SCANCODE_GATEWAY_URL = "http://tb.cn/n/scancode";
    public static final String SCANCODE_PREFIX = "scan_common_";

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<BroadcastReceiver> f9326a = new HashSet<>(10);
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(ScancodeResult scancodeResult);
    }

    public Scancode(Context context) {
        this.b = context;
    }

    public static /* synthetic */ HashSet a(Scancode scancode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("6fd197fe", new Object[]{scancode});
        }
        return scancode.f9326a;
    }

    public static String c(ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("506e4f2a", new Object[]{scancodeTypeArr});
        }
        if (scancodeTypeArr == null || scancodeTypeArr.length < 1) {
            return null;
        }
        return TextUtils.join("-", scancodeTypeArr);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1565e6b5", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("8") || str.length() != 20) && ((!str.startsWith("10") && !str.startsWith("11")) || str.length() != 16)) {
            return false;
        }
        return true;
    }

    public final String b(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8c02f3c", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.scancode.common.util.Scancode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/scancode/common/util/Scancode$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    Serializable serializableExtra = intent.getSerializableExtra(Scancode.GATEWAY_CALLBACK_RESULT_PARAM);
                    if (serializableExtra instanceof ScancodeResult) {
                        aVar.a((ScancodeResult) serializableExtra);
                    }
                    Scancode.a(Scancode.this).remove(this);
                    context.unregisterReceiver(this);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        String uuid = UUID.randomUUID().toString();
        this.b.registerReceiver(broadcastReceiver, new IntentFilter(uuid));
        return uuid;
    }

    public final Uri d(ScancodeType[] scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d28779ee", new Object[]{this, scancodeTypeArr});
        }
        Uri.Builder buildUpon = Uri.parse("https://m.taobao.com/scan_imagesearch").buildUpon();
        buildUpon.appendQueryParameter("fromScan", "true");
        String c = c(scancodeTypeArr);
        if (!TextUtils.isEmpty(c)) {
            buildUpon.appendQueryParameter("scanType", c);
        }
        Uri build = buildUpon.build();
        v7t.i("scan_common_Scancode", "uri===" + build.toString());
        return build;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        v7t.i("scan_common_Scancode", "onDestroy");
        Iterator<BroadcastReceiver> it = this.f9326a.iterator();
        while (it.hasNext()) {
            try {
                this.b.unregisterReceiver(it.next());
            } catch (Exception unused) {
            }
        }
        this.f9326a.clear();
    }

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59587e7c", new Object[]{this, aVar});
        } else {
            i(aVar, null);
        }
    }

    public void h(a aVar, String str, ScancodeType... scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692facdc", new Object[]{this, aVar, str, scancodeTypeArr});
            return;
        }
        String b = b(aVar);
        Bundle bundle = new Bundle();
        bundle.putString(GATEWAY_CALLBACK_ACTION_PARAM, b);
        bundle.putString(GATEWAY_CALLBACK_JSON_PARAM, str);
        Nav.from(this.b).withExtras(bundle).toUri(d(scancodeTypeArr));
    }

    public void i(a aVar, ScancodeType[] scancodeTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57363066", new Object[]{this, aVar, scancodeTypeArr});
            return;
        }
        String b = b(aVar);
        Bundle bundle = new Bundle();
        bundle.putString(GATEWAY_CALLBACK_ACTION_PARAM, b);
        Nav.from(this.b).withExtras(bundle).toUri(d(scancodeTypeArr));
    }
}
