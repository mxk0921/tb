package com.mobile.auth.gatewayauth.manager.base;

import android.util.SparseArray;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000000o<T> extends SparseArray<T> {
    public O000000o(int i) {
        super(i);
    }

    @Override // android.util.SparseArray
    public synchronized void append(int i, T t) {
        try {
            super.append(i, t);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void clear() {
        try {
            super.clear();
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void delete(int i) {
        try {
            super.delete(i);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized T get(int i) {
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
        return (T) super.get(i);
    }

    @Override // android.util.SparseArray
    public synchronized int indexOfKey(int i) {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
        return super.indexOfKey(i);
    }

    @Override // android.util.SparseArray
    public synchronized int indexOfValue(T t) {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
        return super.indexOfValue(t);
    }

    @Override // android.util.SparseArray
    public synchronized int keyAt(int i) {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
        return super.keyAt(i);
    }

    @Override // android.util.SparseArray
    public synchronized void put(int i, T t) {
        try {
            super.put(i, t);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void remove(int i) {
        try {
            super.remove(i);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void removeAt(int i) {
        try {
            super.removeAt(i);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void removeAtRange(int i, int i2) {
        try {
            super.removeAtRange(i, i2);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized void setValueAt(int i, T t) {
        try {
            super.setValueAt(i, t);
        } finally {
            try {
                ExceptionProcessor.processException(th);
            } finally {
            }
        }
    }

    @Override // android.util.SparseArray
    public synchronized int size() {
        try {
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
        return super.size();
    }

    @Override // android.util.SparseArray
    public synchronized T valueAt(int i) {
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
        return (T) super.valueAt(i);
    }

    @Override // android.util.SparseArray
    public synchronized T get(int i, T t) {
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
        return (T) super.get(i, t);
    }
}
