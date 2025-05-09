package com.vivo.push.restructure.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.restructure.request.a.a;
import com.vivo.push.util.u;
import com.vivo.push.util.v;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Intent f14631a;
    private a c;
    private InsideNotificationItem e;
    private UnvarnishedMessage f;
    private String b = "";
    private String d = "";

    public b(Intent intent) {
        this.f14631a = intent;
    }

    private boolean m() {
        if (j() == 4) {
            return true;
        }
        return false;
    }

    private boolean n() {
        if (j() == 3) {
            return true;
        }
        return false;
    }

    private InsideNotificationItem o() {
        InsideNotificationItem insideNotificationItem = this.e;
        if (insideNotificationItem != null) {
            return insideNotificationItem;
        }
        Intent intent = this.f14631a;
        InsideNotificationItem insideNotificationItem2 = null;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("notification_v1");
                if (!(stringExtra == null || (insideNotificationItem2 = v.a(stringExtra)) == null)) {
                    insideNotificationItem2.setMsgId(Long.parseLong(a()));
                }
            } catch (Exception e) {
                u.a("ReceivedMessageImpl", "getNotificationMessage " + e.getMessage());
            }
        }
        this.e = insideNotificationItem2;
        return insideNotificationItem2;
    }

    private UnvarnishedMessage p() {
        Exception e;
        UnvarnishedMessage unvarnishedMessage = this.f;
        if (unvarnishedMessage != null) {
            return unvarnishedMessage;
        }
        Intent intent = this.f14631a;
        UnvarnishedMessage unvarnishedMessage2 = null;
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("msg_v1");
                if (!TextUtils.isEmpty(stringExtra)) {
                    UnvarnishedMessage unvarnishedMessage3 = new UnvarnishedMessage(stringExtra);
                    try {
                        unvarnishedMessage3.setMsgId(Long.parseLong(a()));
                        unvarnishedMessage2 = unvarnishedMessage3;
                    } catch (Exception e2) {
                        e = e2;
                        unvarnishedMessage2 = unvarnishedMessage3;
                        u.a("ReceivedMessageImpl", "getTransmissionMessage " + e.getMessage());
                        this.f = unvarnishedMessage2;
                        return unvarnishedMessage2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        this.f = unvarnishedMessage2;
        return unvarnishedMessage2;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String a() {
        Bundle extras;
        Intent intent = this.f14631a;
        long j = (intent == null || (extras = intent.getExtras()) == null) ? 0L : extras.getLong("notify_id", 0L);
        if (j != 0) {
            return String.valueOf(j);
        }
        return "";
    }

    @Override // com.vivo.push.restructure.a.a
    public final Intent b() {
        return this.f14631a;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String c() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = this.f14631a.getStringExtra("req_id");
        }
        return this.b;
    }

    @Override // com.vivo.push.restructure.a.a
    public final long d() {
        Intent intent = this.f14631a;
        if (intent != null) {
            return intent.getLongExtra("ipc_start_time", 0L);
        }
        return 0L;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean e() {
        Intent intent = this.f14631a;
        if (intent != null) {
            return intent.getBooleanExtra("core_support_monitor", false);
        }
        return false;
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean f() {
        Bundle extras;
        Intent intent = this.f14631a;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return false;
        }
        return extras.getBoolean("client_collect_node", false);
    }

    @Override // com.vivo.push.restructure.a.a
    public final boolean g() {
        a h = h();
        if (h == null || h.a() != 2018) {
            return false;
        }
        return true;
    }

    @Override // com.vivo.push.restructure.a.a
    public final a h() {
        String stringExtra;
        com.vivo.push.restructure.request.a.a.a aVar;
        if (this.c == null && (stringExtra = this.f14631a.getStringExtra("cf_content")) != null) {
            try {
                aVar = new com.vivo.push.restructure.request.a.a.a(stringExtra);
            } catch (JSONException unused) {
                aVar = null;
            }
            if (aVar != null) {
                this.c = a.f14637a.a(aVar);
            }
        }
        return this.c;
    }

    @Override // com.vivo.push.restructure.a.a
    public final String i() {
        if (TextUtils.isEmpty(this.d)) {
            this.d = this.f14631a.getStringExtra("content");
        }
        return this.d;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int j() {
        Intent intent = this.f14631a;
        if (intent == null) {
            return -1;
        }
        int intExtra = intent.getIntExtra("command", -1);
        return intExtra < 0 ? this.f14631a.getIntExtra("method", -1) : intExtra;
    }

    @Override // com.vivo.push.restructure.a.a
    public final int k() {
        if (this.f14631a == null) {
            return 0;
        }
        if (m() && o() != null) {
            return o().getTargetType();
        }
        if (!n() || p() == null) {
            return 0;
        }
        return p().getTargetType();
    }

    @Override // com.vivo.push.restructure.a.a
    public final String l() {
        if (this.f14631a == null) {
            return "";
        }
        if (m() && o() != null) {
            return o().getTragetContent();
        }
        if (!n() || p() == null) {
            return "";
        }
        return p().getTragetContent();
    }
}
