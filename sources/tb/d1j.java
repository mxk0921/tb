package tb;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.interact.ShareDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseActivity f17502a;
    public boolean b;

    static {
        t2o.a(779092493);
    }

    public d1j(BaseActivity baseActivity) {
        this.f17502a = baseActivity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f17502a.getPublicMenu();
        }
    }

    public boolean d(MenuItem menuItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem != null && menuItem.getItemId() == R.id.taolive_menu_register) {
            BaseActivity baseActivity = this.f17502a;
            voj.a(baseActivity, pvs.C2(baseActivity));
            return true;
        } else if (menuItem == null || menuItem.getItemId() != R.id.taolive_menu_report) {
            return false;
        } else {
            if (v2s.o().u() != null && v2s.o().u().checkSessionValid()) {
                ux9 d = vx9.d();
                if (d != null) {
                    str = d.C();
                } else {
                    str = null;
                }
                sjr.g().c("com.taobao.taolive.room.start_report_from_btns", null, str);
            } else if (v2s.o().u() != null) {
                try {
                    v2s.o().u().a(this.f17502a, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return true;
        }
    }

    public void e(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
        } else if (menu != null && menu.findItem(R.id.taolive_menu_register) == null && !this.b) {
            this.f17502a.getMenuInflater().inflate(R.menu.taolive_room_menu, menu);
            this.b = true;
        }
    }

    public void c(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e84f74f", new Object[]{this, menu});
        } else if (menu != null) {
            if (menu.findItem(R.id.taolive_menu_register) == null && !this.b) {
                this.f17502a.getMenuInflater().inflate(R.menu.taolive_room_menu, menu);
                this.b = true;
            }
            this.f17502a.getPublicMenu().togglePublicMenu(true);
            this.f17502a.getPublicMenu().onCreateOptionsMenu(this.f17502a.getMenuInflater(), menu);
            this.f17502a.getPublicMenu().removeCustomMenuItemsByType("report");
        }
    }

    public Object b() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        ux9 d = vx9.d();
        if (up6.p0(d)) {
            FandomPreLiveInfo j = up6.j(d);
            if (j == null) {
                return null;
            }
            String c = u90.c(this.f17502a, j.title);
            String e = u90.e(j.liveId);
            FandomInfo B = up6.B(d);
            if (B != null) {
                str3 = B.shareWeexUrl;
            } else {
                str3 = "";
            }
            return v2s.o().y().b(this.f17502a, c, j.coverImg, j.liveId, j.topic, false, e, str3, "taobaolive_fandom", null);
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 == null || c0.broadCaster == null || c0.shareUrlDO == null || ((str = c0.liveId) != null && !str.equals(vx9.d().i))) {
            return null;
        }
        String str4 = c0.broadCaster.accountName;
        String format = String.format("%1$s的直播简直有毒，快来看！\n%2$s", str4, c0.title);
        if (!TextUtils.isEmpty(pvs.x2())) {
            format = String.format(pvs.x2(), str4, c0.title);
        }
        dpd y = v2s.o().y();
        BaseActivity baseActivity = this.f17502a;
        if (TextUtils.isEmpty(c0.shareUrlDO.bgImgUrl)) {
            str2 = c0.coverImg;
        } else {
            str2 = c0.shareUrlDO.bgImgUrl;
        }
        String str5 = c0.liveId;
        String str6 = c0.topic;
        ShareDo shareDo = c0.shareUrlDO;
        return y.b(baseActivity, format, str2, str5, str6, false, shareDo.shareUrl, shareDo.shareCardUrl, "zhibo_normal", null);
    }
}
