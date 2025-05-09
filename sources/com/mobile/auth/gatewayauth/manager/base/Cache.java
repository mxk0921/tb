package com.mobile.auth.gatewayauth.manager.base;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pxf;
import tb.swf;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Cache<T> implements Serializable {
    private long expiredTime;
    private String key;
    private T value;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class O000000o<T> {
        private String O000000o;
        private T O00000Oo;
        private long O00000o0;

        private O000000o() {
        }

        public static /* synthetic */ Object O00000Oo(O000000o o000000o) {
            try {
                return o000000o.O00000Oo;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public static /* synthetic */ long O00000o0(O000000o o000000o) {
            try {
                return o000000o.O00000o0;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return -1L;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return -1L;
                }
            }
        }

        public O000000o O000000o(long j) {
            try {
                this.O00000o0 = j;
                return this;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public O000000o O000000o(T t) {
            try {
                this.O00000Oo = t;
                return this;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public O000000o O000000o(String str) {
            try {
                this.O000000o = str;
                return this;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public Cache O000000o() {
            try {
                return new Cache(this);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }

        public static /* synthetic */ String O000000o(O000000o o000000o) {
            try {
                return o000000o.O000000o;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        }
    }

    public Cache() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Cache<T> fromJson(JSONObject jSONObject, swf<T> swfVar) {
        try {
            Cache<T> cache = (Cache<T>) new Cache();
            ArrayList arrayList = new ArrayList();
            wrf.a(jSONObject, cache, arrayList);
            if (arrayList.size() > 0) {
                T newInstance = swfVar.newInstance();
                if (newInstance instanceof pxf) {
                    ((pxf) newInstance).fromJson(jSONObject.optJSONObject("value"));
                    cache.setValue(newInstance);
                } else if (wrf.c(newInstance.getClass()) || wrf.d(newInstance.getClass()) || wrf.e(newInstance.getClass()) || wrf.f(newInstance.getClass())) {
                    cache.setValue(jSONObject.opt("value"));
                }
            }
            return cache;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static O000000o newIpCache() {
        try {
            return new O000000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public synchronized void clear() {
        try {
            this.key = null;
            this.value = null;
            this.expiredTime = 0L;
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public synchronized long getExpiredTime() {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1L;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1L;
            }
        }
        return this.expiredTime;
    }

    public synchronized String getKey() {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.key;
    }

    public synchronized T getValue() {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
        return this.value;
    }

    public synchronized boolean isValid() {
        boolean z;
        z = false;
        try {
            if (System.currentTimeMillis() < this.expiredTime) {
                z = true;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
        return z;
    }

    public synchronized void setExpiredTime(long j) {
        try {
            this.expiredTime = j;
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public synchronized void setKey(String str) {
        try {
            this.key = str;
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public synchronized void setValue(T t) {
        try {
            this.value = t;
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    public JSONObject toJson() {
        Class<?> cls;
        T t;
        Object obj;
        try {
            JSONObject n = wrf.n(this, new ArrayList());
            try {
                cls = this.value.getClass();
                t = this.value;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (t instanceof pxf) {
                obj = ((pxf) t).toJson();
            } else {
                if (wrf.c(cls) || wrf.d(cls) || wrf.e(cls) || wrf.f(cls)) {
                    obj = this.value;
                }
                return n;
            }
            n.put("value", obj);
            return n;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Cache(O000000o<T> o000000o) {
        setKey(O000000o.O000000o((O000000o) o000000o));
        setValue(O000000o.O00000Oo(o000000o));
        setExpiredTime(O000000o.O00000o0(o000000o));
    }
}
