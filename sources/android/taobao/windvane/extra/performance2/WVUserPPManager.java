package android.taobao.windvane.extra.performance2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVUserPPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long FP;
    private long TTI;

    static {
        t2o.a(989856014);
    }

    public String jsCodeForUserPP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dae6debb", new Object[]{this});
        }
        return "javascript:(function(){var observer=new PerformanceObserver(function(list,obj){for(var entry of list.getEntries()){if(entry.entryType=='paint'&&entry.name=='first-paint'){console.log('hybrid://WVPerformance:FP/receiveFPTime?{\"time\":'+entry.startTime+'}')}if(entry.entryType=='longtask'){console.log('hybrid://WVPerformance:TTI/receiveTTITime?{\"time\":'+(entry.startTime+entry.duration)+'}')}}});observer.observe({entryTypes:['longtask','paint']})})()";
    }
}
