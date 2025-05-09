package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c95 implements ytb, View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float[] f = {1.0f, 1.5f, 0.8f};

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f16921a;
    public final FrameLayout b;
    public TextView c;
    public int d = 0;
    public ntb e;

    static {
        t2o.a(452985153);
        t2o.a(452985011);
    }

    public c95(DWContext dWContext, FrameLayout frameLayout) {
        this.f16921a = dWContext;
        this.b = frameLayout;
        a();
        if (dWContext != null && dWContext.getVideo() != null) {
            dWContext.getVideo().l(this);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f16921a;
        if (dWContext != null && dWContext.getVideo() != null && this.b != null && this.f16921a.mPlayContext.getPlayerType() != 2 && this.f16921a.isPlayRateBtnEnable()) {
            TextView textView = (TextView) this.b.findViewById(R.id.video_controller_playrate_icon);
            this.c = textView;
            if (textView == null) {
                return;
            }
            if (this.f16921a.mShowPlayRate) {
                textView.setVisibility(0);
                this.c.setOnClickListener(this);
                return;
            }
            textView.setVisibility(8);
        }
    }

    public void b(ntb ntbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbab87a2", new Object[]{this, ntbVar});
        } else {
            this.e = ntbVar;
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        float[] fArr = f;
        int length = (this.d + 1) % fArr.length;
        float f2 = fArr[length];
        ntb ntbVar = this.e;
        if (ntbVar != null) {
            z = ntbVar.onPlayRateChanged(f2);
        }
        if (z) {
            this.d = length;
            if (length == 0) {
                this.c.setText(R.string.tbavsdk_playrate_normal);
            } else if (length == 1) {
                this.c.setText(R.string.tbavsdk_playrate_high);
            } else if (length == 2) {
                this.c.setText(R.string.tbavsdk_playrate_low);
            }
            DWContext dWContext = this.f16921a;
            if (dWContext != null && dWContext.mUTAdapter != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(TBImageFlowMonitor.SPEED_MEASURE, String.valueOf(f2));
                if (this.f16921a.isMute()) {
                    str = "true";
                } else {
                    str = "false";
                }
                hashMap.put("mute", str);
                DWContext dWContext2 = this.f16921a;
                dWContext2.mUTAdapter.a("DWVideo", "Button", "videospeed", dWContext2.getUTParams(), hashMap);
            }
        }
    }
}
