package database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.criminalintent.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
   fun getCrimes(): LiveData<List<Crime>>
    // fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
  //  fun getCrime(id: UUID): Crime?
    fun getCrime(id: UUID): LiveData<Crime?>
}