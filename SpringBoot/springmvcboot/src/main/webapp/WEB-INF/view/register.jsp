<!DOCTYPE html>
<html>
<head>
    <title>Modern Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #4e73df, #1cc88a);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: white;
            padding: 30px;
            width: 400px;
            border-radius: 12px;
            box-shadow: 0px 10px 25px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }

        input, select {
            width: 100%;
            padding: 8px;
            border-radius: 6px;
            border: 1px solid #ccc;
            outline: none;
            transition: 0.3s;
        }

        input:focus, select:focus {
            border-color: #4e73df;
            box-shadow: 0 0 5px rgba(78,115,223,0.5);
        }

        .gender {
            display: flex;
            gap: 15px;
        }

        .btn {
            width: 100%;
            padding: 10px;
            background-color: #4e73df;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
            transition: 0.3s;
        }

        .btn:hover {
            background-color: #2e59d9;
        }

        .reset-btn {
            background-color: #e74a3b;
            margin-top: 10px;
        }

        .reset-btn:hover {
            background-color: #c0392b;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Registration Form</h2>
        <form action="/create-account" method="post">

            <div class="form-group">
                <label>Full Name</label>
                <input type="text" name="name" placeholder="Enter your name" required>
            </div>

            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" placeholder="Enter your email" required>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" placeholder="Enter password" required>
            </div>

            <div class="form-group">
                <label>Gender</label>
                <div class="gender">
                    <label><input type="radio" name="gender" value="Male"> Male</label>
                    <label><input type="radio" name="gender" value="Female"> Female</label>
                </div>
            </div>

            <div class="form-group">
                <label>Country</label>
                <select name="country">
                    <option>India</option>
                    <option>USA</option>
                    <option>UK</option>
                </select>
            </div>

            <button type="submit" class="btn">Register</button>
            <button type="reset" class="btn reset-btn">Clear</button>

        </form>
    </div>

</body>
</html>